package localhost.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJsonUtil {

  private final static ObjectMapper MAPPER = new ObjectMapper();

  public static String objectToJson(Object object) {
    try {
      return MAPPER.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static String objectToJsonNested(Object object) {
    return objectToJson(object).replace("\"", "\\\"");
  }
}
