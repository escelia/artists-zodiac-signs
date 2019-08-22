package zodiac;

public class Application {

  public static void main(String[] args) throws Exception {
    String artist = "Elon Musk";
    ZodiacProfile zp = new ZodiacProfile(artist);
    System.out.println(zp.getZodiacSign().toString());
    System.out.println(zp.compatibleTo(ZodiacSign.AQUARIUS));

//    ZodiacGroups zg = zp.loadGroups();
//    for(ZodiacSign sign : zg.getAir()) {
//      System.out.println(sign);
//    }
//    System.out.println("Zodiac sign of " + artist + " is " + ZodiacUtils.zodiacSignOf(artist));
  }
}
