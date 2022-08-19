package localhost.utils;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class GenerateUtilTest {

  @Test
  public void getRandomBoolean_test() {
    assertDoesNotThrow(GenerateUtil::getRandomBoolean);
  }

  @Test
  public void getRandomByte_test() {
    assertDoesNotThrow(GenerateUtil::getRandomByte);
  }

  @Test
  public void getRandomShort_test() {
    assertDoesNotThrow(GenerateUtil::getRandomShort);
  }

  @Test
  public void getRandomInt_test() {
    assertDoesNotThrow(GenerateUtil::getRandomInt);
  }

  @Test
  public void getRandomLong_test() {
    assertDoesNotThrow(GenerateUtil::getRandomLong);
  }

  @Test
  public void getRandomFloat_test() {
    assertDoesNotThrow(GenerateUtil::getRandomFloat);
  }

  @Test
  public void getRandomDouble_test() {
    assertDoesNotThrow(GenerateUtil::getRandomDouble);
  }
}
