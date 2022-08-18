package localhost.utils;

import java.util.Random;

public class GenerateUtil {

  public static int getRandomInt() {
    return new Random().nextInt();
  }

  public static long getRandomLong() {
    return new Random().nextLong();
  }
}
