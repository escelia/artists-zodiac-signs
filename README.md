# zodiac-utils

Find the zodiac sign of any person with a live wikipedia page.

## Usage
```
String artist = "David Bowie";
ZodiacProfile zp = new ZodiacProfile(artist);
System.out.println(zp.getZodiacSign());
System.out.println(zp.compatibleTo(ZodiacSign.AQUARIUS));
```
