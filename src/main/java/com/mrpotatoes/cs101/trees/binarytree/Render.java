package com.mrpotatoes.cs101.trees.binarytree;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Print the tree and write it to a file.
 * 
 * @author alibresinn
 * @todo: Move this to the correct area.
 */
public class Render {
  public static void writeFile(Node tree) throws IOException {
    String workingDir = System.getProperty("user.dir");
    String testjson = workingDir + "/test.json";
    System.out.println("Test file located: " + testjson);
    
    // Take dat tree, convert it to string then pretty print.
    String json = Render.prettyPrint(Render.getJsonString(tree));
    
    Files.write(
      Paths.get(testjson),
      Render.prettyPrint(json).getBytes()
    );
  }
  
  /**
   * 
   * @param tree
   * @return 
   */
  public static String getJsonString(Node tree) {
    Gson gson = new Gson();
    String json = gson.toJson(tree);
    
    return json;
  }
  
  /**
   * Pretty print JSON Tree
   * 
   * @see https://coderwall.com/p/ab5qha/convert-json-string-to-pretty-print-java-gson
   * 
   * @param String jsonString
   *   The json string.
   * 
   * @return string
   *   The formatted pretty printed JSON string.
   */
  public static String prettyPrint(String jsonString) {
    JsonParser parser = new JsonParser();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    JsonObject json = parser.parse(jsonString).getAsJsonObject();
    String prettyJson = gson.toJson(json);

    return prettyJson;
  }
  
  /**
   * 
   * @todo: Write a test for this.
   * 
   * @param tree
   * @return 
   */
  public static String prettyPrint(Node tree) {
    String json = Render.getJsonString(tree);
    
    // Call the sister method instead.
    return Render.prettyPrint(json);
  }
}
