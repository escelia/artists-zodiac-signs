package zodiac;

public class Application {

  public static void main(String[] args) throws Exception {
    String artist = "Elon Musk";
    System.out.println("Zodiac sign of " + artist + " is " + ZodiacUtils.zodiacSignOf(artist));
  }
}
