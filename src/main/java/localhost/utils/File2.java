package localhost.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class File2 {

  public static String read(String path) {
    File file = new File(path);
    String text = "";
    try {
      byte[] ar = Files.readAllBytes(file.toPath());
      text = new String(ar, StandardCharsets.UTF_16BE);
    } catch (IOException e) {
      return null;
    }
    return text;
  }

//  public static void write(String text, String path) {
//    try (FileWriter writer = new FileWriter(path, false)) {
//      writer.write(text);
////      writer.flush();
//    } catch (IOException ex) {
//      System.out.println(ex.getMessage());
//    }
//  }
}
