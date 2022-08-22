package localhost.utils;

import java.math.BigDecimal;
import java.util.Random;

public class GenerateUtil {

  public static boolean getRandomBoolean() {
    return new Random().nextBoolean();
  }

  public static byte getRandomByte() {
    return (byte) new Random().nextInt();
  }

  public static short getRandomShort() {
    return (short) new Random().nextInt();
  }

  public static int getRandomInt() {
    return new Random().nextInt();
  }

  public static long getRandomLong() {
    return new Random().nextLong();
  }

  public static float getRandomFloat() {
    return new Random().nextFloat();
  }

  public static double getRandomDouble() {
    return new Random().nextDouble();
  }

  public static BigDecimal getRandomBigDecimal() {
    return new BigDecimal(getRandomDouble());
  }
}
