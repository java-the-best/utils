package localhost.utils;

import static localhost.utils.GenerateUtil.getRandomBigDecimal;
import static localhost.utils.GenerateUtil.getRandomBoolean;
import static localhost.utils.GenerateUtil.getRandomByte;
import static localhost.utils.GenerateUtil.getRandomDouble;
import static localhost.utils.GenerateUtil.getRandomFloat;
import static localhost.utils.GenerateUtil.getRandomInt;
import static localhost.utils.GenerateUtil.getRandomLong;
import static localhost.utils.GenerateUtil.getRandomShort;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FillingFieldsObjectUtil {

  public static <T> T fillingFields(T object) {
    return fillingFields(object, null);
  }

  public static <T> T fillingFields(T object, String stringValue) {
    Class<?> objectClass = object.getClass();
    List<Field> fieldList = new ArrayList<>();
    fieldList.addAll(Arrays.asList(objectClass.getDeclaredFields()));
    Class<?> superclass = objectClass.getSuperclass();
    while (!Objects.equals(superclass, Object.class)) {
      fieldList.addAll(Arrays.asList(superclass.getDeclaredFields()));
      superclass = superclass.getSuperclass();
    }
    fieldList.forEach(field -> {
      field.setAccessible(true);
      Class<?> fieldType = field.getType();
      String fieldTypeName = fieldType.getName();
      Object fieldNewValue;
      if (Objects.equals(fieldTypeName, "java.lang.Boolean")
          || Objects.equals(fieldTypeName, "boolean")) {
        fieldNewValue = getRandomBoolean();
      } else if (Objects.equals(fieldTypeName, "java.lang.Byte")
          || Objects.equals(fieldTypeName, "byte")) {
        fieldNewValue = getRandomByte();
      } else if (Objects.equals(fieldTypeName, "java.lang.Short")
          || Objects.equals(fieldTypeName, "short")) {
        fieldNewValue = getRandomShort();
      } else if (Objects.equals(fieldTypeName, "java.lang.Integer")
          || Objects.equals(fieldTypeName, "int")) {
        fieldNewValue = getRandomInt();
      } else if (Objects.equals(fieldTypeName, "java.lang.Long")
          || Objects.equals(fieldTypeName, "long")) {
        fieldNewValue = getRandomLong();
      } else if (Objects.equals(fieldTypeName, "java.lang.Float")
          || Objects.equals(fieldTypeName, "float")) {
        fieldNewValue = getRandomFloat();
      } else if (Objects.equals(fieldTypeName, "java.lang.Double")
          || Objects.equals(fieldTypeName, "double")) {
        fieldNewValue = getRandomDouble();
      } else if (Objects.equals(fieldTypeName, "java.math.BigDecimal")) {
        fieldNewValue = getRandomBigDecimal();
      } else if (Objects.equals(fieldTypeName, "java.lang.String")) {
        if (stringValue == null) {
          fieldNewValue = field.getName();
        } else {
          fieldNewValue = stringValue;
        }
      } else {
        try {
          fieldNewValue = fieldType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
          fieldNewValue = null;
        }
      }
      try {
        field.set(object, fieldNewValue);
      } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
      }
    });
    return object;
  }
}
