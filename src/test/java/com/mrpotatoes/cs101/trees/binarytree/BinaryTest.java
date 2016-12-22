/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrpotatoes.cs101.trees.binarytree;

import junit.framework.TestCase;

/**
 *
 * @author alibresinn
 */
public class BinaryTest extends TestCase {

  public BinaryTest(String testName) {
    super(testName);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
  }

  /**
   * Test of addNode method, of class Binary.
   */
  public void testMain() {
    Binary theTree = new Binary();

		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice President");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales Manager");
		theTree.addNode(85, "Salesman 1");

    System.out.println("\nNode with the key 75");
		System.out.println(theTree.findNode(75));
		System.out.println("Remove Key 25");

		theTree.remove(25);

		System.out.println(theTree.findNode(25));

		theTree.inOrderTraverseTree(theTree.root);
    
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}
