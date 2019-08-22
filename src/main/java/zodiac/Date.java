package zodiac;

import org.apache.commons.lang3.StringUtils;

public class Date {

  int month;
  int day;

  Date(int month, int day) {
    this.month = month;
    this.day = day;
  }

  boolean isBefore(Date otherDate) {
    return this.month < otherDate.month || (this.month == otherDate.month && this.day < otherDate.day);
  }

  boolean isBeforeOrEqual(Date otherDate) {
    return this.month < otherDate.month || (this.month == otherDate.month && this.day <= otherDate.day);
  }

  boolean isAfter(Date otherDate) {
    return this.month > otherDate.month || (this.month == otherDate.month && this.day > otherDate.day);
  }

  boolean isAfterOrEqual(Date otherDate) {
    return this.month > otherDate.month || (this.month == otherDate.month && this.day >= otherDate.day);
  }

  static Date parseDate(String date) {
    return new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 5)));
  }

  static Date parseMonthDay(String str) {

    for(int i = 0; i < str.length(); i++) {
      if(StringUtils.isNumeric(str.substring(i, i + 4))) {
        String date = str.substring(i + 5, i + 10);
        if(date.charAt(1) == '|') {
          if(!StringUtils.isNumeric(Character.toString(date.charAt(3)))) {
            return new Date(Integer.parseInt(date.substring(0, 1)), Integer.parseInt(date.substring(2, 3)));
          }
          return new Date(Integer.parseInt(date.substring(0, 1)), Integer.parseInt(date.substring(2, 4)));
        }
        if(date.charAt(2) == '|') {
          if(!StringUtils.isNumeric(Character.toString(date.charAt(4)))) {
            return new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 4)));
          }
          return new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 5)));
        }

        if(!StringUtils.isNumeric(Character.toString(str.charAt(3)))) {
          return new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 4)));
        }

        return new Date(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 5)));
      }
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if(o == this) {
      return true;
    }

    if(!(o instanceof Date)) {
      return false;
    }

    Date otherDate = (Date) o;

    return this.month == otherDate.month && this.day == otherDate.day;
  }

  public String toString() {
    return month + "|" + day;
  }
}
