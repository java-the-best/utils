package localhost.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ToJsonUtil {

  private final static ObjectMapper MAPPER = new ObjectMapper();

  public static String objectToJson(Object object) {
    try {
      return MAPPER.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public static String objectToJsonNested(Object object) {
    return jsonNested(objectToJson(object));
  }

  public static void main(String[] args) {
    String str = File2.read("D:\\engineer\\124.txt");
    str = jsonNested(objectToJson(str));
    str = str.replace("\\n", "");
    str = str.replace("\\r", "");
    while (str.contains(" ")) {
      str = str.replace(" ", "");
    }
//    File2.write(str, "D:\\engineer\\123.txt");
    System.out.println(str);
  }

  private static String jsonNested(String json) {
    return json.replace("\"", "\\\"").replace("\\\\", "\\");
  }
}
