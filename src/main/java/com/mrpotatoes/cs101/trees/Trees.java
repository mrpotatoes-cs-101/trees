package com.mrpotatoes.cs101.trees;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mrpotatoes.cs101.trees.binarytree.Binary;
import com.mrpotatoes.cs101.trees.binarytree.Render;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Trees {
  public static void main(String[] args) throws IOException {
    Binary theTree = new Binary();

    theTree.addNode(50, "Boss");
    theTree.addNode(25, "Vice President");
    theTree.addNode(15, "Office Manager");
    theTree.addNode(30, "Secretary");
    theTree.addNode(75, "Sales Manager");
    theTree.addNode(85, "shit fucks 1");
    theTree.addNode(17, "17");
    theTree.addNode(5, "Less I hope");
    theTree.addNode(3, "3");
    
    Render.writeFile(theTree.root);
  }
  
  /**
   * Pretty print JSON Tree
   * 
   * @see https://coderwall.com/p/ab5qha/convert-json-string-to-pretty-print-java-gson
   * 
   * @param string jsonString
   * 
   * @return string
   *   The formatted pretty printed JSON string.
   */
  public static String toPrettyFormat(String jsonString) {
    JsonParser parser = new JsonParser();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    JsonObject json = parser.parse(jsonString).getAsJsonObject();
    String prettyJson = gson.toJson(json);

    return prettyJson;
  }
}
