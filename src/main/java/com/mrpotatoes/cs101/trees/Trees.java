package com.mrpotatoes.cs101.trees;

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

//    theTree.addNode(50, "Boss");
//    theTree.addNode(25, "Vice President");
//    theTree.addNode(15, "Office Manager");
//    theTree.addNode(30, "Secretary");
//    theTree.addNode(75, "Sales Manager");
//    theTree.addNode(85, "shit fucks 1");
//    theTree.addNode(17, "17");
//    theTree.addNode(5, "Less I hope");
//    theTree.addNode(3, "3");
    
//    theTree.addNode(1, "One");
//    theTree.addNode(2, "Two");
//    theTree.addNode(3, "Three");
//    theTree.addNode(4, "Four");
//    theTree.addNode(5, "Five");
//    theTree.addNode(6, "Six");
//    theTree.addNode(7, "Seven");
//    theTree.addNode(8, "Eight");
//    theTree.addNode(9, "Nine");
    
    theTree.addNode(9, "Nine");
    theTree.addNode(5, "Five");
    theTree.addNode(1, "One");
    theTree.addNode(7, "Seven");
    theTree.addNode(3, "Three");
    theTree.addNode(2, "Two");
    theTree.addNode(4, "Four");
    theTree.addNode(8, "Eight");
    theTree.addNode(6, "Six");
    
    Render.writeFile(theTree.root);
    
//    theTree.postOrderTraverseTree(theTree.root);
  }
}
