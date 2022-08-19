package localhost.utils;

import static localhost.utils.FillingFieldsObjectUtil.fillingFields;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import localhost.utils.common.ObjectTest;
import org.junit.jupiter.api.Test;

public class FillingFieldsObjectUtilTest {

  @Test
  public void test() {
    ObjectTest objectTest = fillingFields(new ObjectTest());
    assertNotNull(objectTest);
    assertNotNull(objectTest.isBooleanField());
    assertNotNull(objectTest.getBooleanFieldClass());
    assertNotNull(objectTest.getByteField());
    assertNotNull(objectTest.getByteFieldClass());
    assertNotNull(objectTest.getShortField());
    assertNotNull(objectTest.getShortFieldClass());
    assertNotNull(objectTest.getIntField());
    assertNotNull(objectTest.getIntegerFieldClass());
    assertNotNull(objectTest.getLongField());
    assertNotNull(objectTest.getLongFieldClass());
    assertNotNull(objectTest.getFloatField());
    assertNotNull(objectTest.getFloatFieldClass());
    assertNotNull(objectTest.getDoubleField());
    assertNotNull(objectTest.getDoubleFieldClass());
    assertNotNull(objectTest.getStringField());
    assertEquals(objectTest.getStringField(), "stringField");
    assertNotNull(objectTest.getObjectField());
    assertNull(objectTest.getBigDecimalField());
    assertNull(objectTest.getDateField());
  }
}
