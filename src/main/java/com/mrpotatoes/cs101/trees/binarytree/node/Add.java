/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrpotatoes.cs101.trees.binarytree.node;

import com.mrpotatoes.cs101.trees.binarytree.Node;

/**
 *
 * @author alibresinn
 */
public class Add {
  Node root;

  /**
   * @param key
   * @param name
   * @todo Re-factor me so that it's simpler maybe.
   * @todo Do not add the same thing.
   */
	public void addNode(int key, String name) {
		// Create a new Node and initialize it
		Node newNode = new Node(key, name);

		// If there is no tree create it and early bail.
		if (root == null) {
			root = newNode;
      return;
		}


    // Set root as the Node we will start with as we traverse the tree.
    Node focusNode = root;

    // Future parent for our new Node.
    Node parent;

    // This is [mostly] the find. See if you can use the FIND class.
    while (true) {
      // root is the top parent so we start there.
      parent = focusNode;

      // Check if the new node should go on the left side of the parent node.
      if (key < focusNode.key) {
        // Switch focus to the left child.
        focusNode = focusNode.leftChild;

        // If the left child has no children.
        if (focusNode == null) {
          // then place the new node on the left of it.
          parent.leftChild = newNode;
          return;
        }
      }
      // If we get here put the node on the right
      else {
        focusNode = focusNode.rightChild;

        // If the right child has no children.
        if (focusNode == null) {
          // Then place the new node on the right of it.
          parent.rightChild = newNode;
          return;
        }
      }
    }
  }
}
