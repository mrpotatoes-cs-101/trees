/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrpotatoes.cs101.trees.binarytree;

/**
 *
 * @author alibresinn
 */
public class Insertion {
  Node root;

  /**
   * @param key
   * @param name
   * @todo Re-factor me so that it's simpler maybe.
   */
	public void addNode(int key, String name) {
    // Convenience variable so that the if/else checks aren't huge.
    String side;

    // Future parent for our new node.
    Node parent;

		// Create a new Node and initialize.
		Node newNode = new Node(key, name);

    // Set root as the Node we will start with as we traverse the tree. This
    // will be null if root is null but we'll return before anything happens
    // with focusNode.
    Node focusNode = this.root;

		// If there is no root this becomes root; leave.
		if (this.root == null) {
			this.root = newNode;
      return;
		}

    while (true) {
      // root is the top parent so we start there.
      parent = focusNode;

      // Check if the new node should go on the left side of the parent node.
      side = (key < focusNode.key) ? "left" : "right";

      this.addChild(side, parent, focusNode, newNode);
    }
	}

  protected void addChild(String side, Node parent, Node focusNode, Node newNode) {
    // Switch focus to the left child.
    focusNode = focusNode.getChild(side);

    // If the left child has no children.
    if (focusNode == null) {
      // then place the new node on the left of it.
      parent.setChild(side, newNode);
    }
  }

  protected void addLeft(Node parent, Node focusNode, Node newNode) {
    this.addChild("left", parent, focusNode, newNode);
  }

  protected void addRight(Node parent, Node focusNode, Node newNode) {
    this.addChild("right", parent, focusNode, newNode);
  }
}
