package localhost.utils;

import static localhost.utils.GenerateUtil.getRandomInt;
import static localhost.utils.GenerateUtil.getRandomLong;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GenerateUtilTest {

  @Test
  public void getRandomInt_test() {
    assertTrue(Integer.MAX_VALUE > getRandomInt()
        && Integer.MIN_VALUE < getRandomInt());
  }

  @Test
  public void getRandomLong_test() {
    assertTrue(Long.MAX_VALUE > getRandomLong()
        && Long.MIN_VALUE < getRandomLong());
  }
}
