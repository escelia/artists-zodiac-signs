package zodiac;

import java.util.ArrayList;
import java.util.List;

public class ZodiacGroups {

  private List<ZodiacSign> earth;
  private List<ZodiacSign> water;
  private List<ZodiacSign> air;
  private List<ZodiacSign> fire;

  public List<ZodiacSign> getEarth() {
    return this.earth;
  }

  public List<ZodiacSign> getWater() {
    return this.water;
  }

  public List<ZodiacSign> getAir() {
    return this.air;
  }

  public List<ZodiacSign> getFire() {
    return this.fire;
  }

  public boolean earthWaterContains(ZodiacSign sign) {
    return earth.contains(sign) || water.contains(sign);
  }

  public boolean airFireContains(ZodiacSign sign) {
    return air.contains(sign) || fire.contains(sign);
  }

  public boolean waterContains(ZodiacSign sign) {
    return water.contains(sign);
  }

  public Group groupOf(ZodiacSign sign) {
    if(sign.equals(ZodiacSign.CAPRICORN) || sign.equals(ZodiacSign.VIRGO) || sign.equals(ZodiacSign.TAURUS)) {
      return Group.EARTH;
    }
    else if(sign.equals(ZodiacSign.PISCES) || sign.equals(ZodiacSign.SCORPIO) || sign.equals(ZodiacSign.CANCER)) {
      return Group.WATER;
    }
    else if(sign.equals(ZodiacSign.AQUARIUS) || sign.equals(ZodiacSign.LIBRA) || sign.equals(ZodiacSign.GEMINI)) {
      return Group.AIR;
    }
    else {
      return Group.FIRE;
    }
  }

}
