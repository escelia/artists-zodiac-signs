package zodiac;

public class FindZodiac {

  public static ZodiacSign findZodiacSign(Date dateOfBirth) {

    Date piscesAriesCusp = Date.parseDate("03|21");
    Date ariesTaurusCusp = Date.parseDate("04|20");
    Date taurusGeminiCusp = Date.parseDate("05|21");
    Date geminiCancerCusp = Date.parseDate("06|21");
    Date cancerLeoCusp = Date.parseDate("07|23");
    Date leoVirgoCusp = Date.parseDate("08|23");
    Date virgoLibraCusp = Date.parseDate("09|23");
    Date libraScorpioCusp = Date.parseDate("10|23");
    Date scorpioSagittariusCusp = Date.parseDate("11|22");
    Date sagittariusCapricornCusp = Date.parseDate("12|22");
    Date capricornAquariusCusp = Date.parseDate("01|20");
    Date aquariusPiscesCusp = Date.parseDate("02|19");

    if(dateOfBirth.isBefore(ariesTaurusCusp) && dateOfBirth.isAfterOrEqual(piscesAriesCusp)) {
      return ZodiacSign.ARIES;
    }
    else if(dateOfBirth.isBefore(taurusGeminiCusp) && dateOfBirth.isAfterOrEqual(ariesTaurusCusp)) {
      return ZodiacSign.TAURUS;
    }
    else if(dateOfBirth.isBefore(geminiCancerCusp) && dateOfBirth.isAfterOrEqual(taurusGeminiCusp)) {
      return ZodiacSign.GEMINI;
    }
    else if(dateOfBirth.isBefore(cancerLeoCusp) && dateOfBirth.isAfterOrEqual(geminiCancerCusp)) {
      return ZodiacSign.CANCER;
    }
    else if(dateOfBirth.isBefore(leoVirgoCusp) && dateOfBirth.isAfterOrEqual(cancerLeoCusp)) {
      return ZodiacSign.LEO;
    }
    else if(dateOfBirth.isBefore(virgoLibraCusp) && dateOfBirth.isAfterOrEqual(leoVirgoCusp)) {
      return ZodiacSign.VIRGO;
    }
    else if(dateOfBirth.isBefore(libraScorpioCusp) && dateOfBirth.isAfterOrEqual(virgoLibraCusp)) {
      return ZodiacSign.LIBRA;
    }
    else if(dateOfBirth.isBefore(scorpioSagittariusCusp) && dateOfBirth.isAfterOrEqual(libraScorpioCusp)) {
      return ZodiacSign.SCORPIO;
    }
    else if(dateOfBirth.isBefore(sagittariusCapricornCusp) && dateOfBirth.isAfterOrEqual(scorpioSagittariusCusp)) {
      return ZodiacSign.SAGITTARIUS;
    }
    else if((dateOfBirth.isBeforeOrEqual(Date.parseDate("12|31")) && dateOfBirth.isAfter(sagittariusCapricornCusp)) ||
              dateOfBirth.isBefore(capricornAquariusCusp) && dateOfBirth.isAfterOrEqual(Date.parseDate("01|01"))) {
      return ZodiacSign.CAPRICORN;
    }
    else if(dateOfBirth.isBefore(aquariusPiscesCusp) && dateOfBirth.isAfterOrEqual(capricornAquariusCusp)) {
      return ZodiacSign.AQUARIUS;
    }
    else
      return ZodiacSign.PISCES;
  }
}
