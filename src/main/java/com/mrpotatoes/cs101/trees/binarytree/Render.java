package com.mrpotatoes.cs101.trees.binarytree;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mrpotatoes.cs101.trees.Trees;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see http://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
 * @see http://stackoverflow.com/questions/2241513/java-printing-a-binary-tree-using-level-order-in-a-specific-format
 * @see http://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/
 * @author alibresinn
 */
public class Render {
  public static void writeFile(Node tree) throws IOException {
    String workingDir = System.getProperty("user.dir");
    
    // Take dat tree, convert it to string then pretty print.
    String json = Render.prettyPrint(
      Render.getJsonString(tree)
    );
    
    // Yuck but whatever guys. Sometimes you just gotta do.
    try {
      Files.write(
        Paths.get(workingDir + "/test.json"),
        Trees.toPrettyFormat(json).getBytes()
      );
    } catch (IOException ex) {
      Logger.getLogger(Trees.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
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
  
  public static String prettyPrint(Node tree) {
    Gson gson = new Gson();
    String json = gson.toJson(tree);
    
    // Call the sister method instead.
    return Render.prettyPrint(json);
  }
}
