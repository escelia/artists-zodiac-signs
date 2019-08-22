//package zodiac;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import org.apache.commons.lang3.StringUtils;
//
//public class ZodiacUtils {
//
//  public static String zodiacSignOf(String artist) throws Exception {
//    String response = ZodiacHelperClass.wikipediaGetRequest(artist);
//
////    System.out.println("JSON String Result " + response);
//
//    String parsedBirthdayStr = ZodiacHelperClass.parseBirthday(response);
//    Date birthDate = Date.parseMonthDay(parsedBirthdayStr);
//
////    System.out.println(birthDate);
//
//    return ZodiacHelperClass.findZodiacSign(birthDate).name();
//  }
//
//}