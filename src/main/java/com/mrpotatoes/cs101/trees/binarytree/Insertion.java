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
  Node focusNode;
  
  // Set the root node?
  public Insertion(Node root) {
    this.root = root;
  }
  
  public void add(int key, String name) {
    this.insert(key, name);
  }

  /**
   * Inserting a node into a tree.
   * 
   * There are 3 conditions.
   * 1. If no tree then node is root.
   * 2. Do comparison:
   *   * If lesser go left.
   *   * If greater go right.
   * 3. If there is left or right child then go down the tree some more.
   * 4. Use recursion.
   * 
   * @param key
   * @param name
   * @todo Re-factor me so that it's simpler maybe.
   */
	public void insert(int key, String name) {
    boolean nodeAdded = false;
    
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

    // Remember, this will go on forever and will destory your computer if you
    // don't actually break out (or return if you're a nasty person).
    while (true) {
      // root is the top parent so we start there.
      parent = focusNode;

      // Check if the new node should go on the left side of the parent node.
      side = (key < focusNode.key) ? "left" : "right";

      nodeAdded = this.addChild(side, parent, focusNode, newNode);
      
      if (nodeAdded) {
        // Don't return in a while loop; that's just gross.
        break;
      }
    }
	}

  protected boolean addChild(String side, Node parent, Node focusNode, Node newNode) {
    boolean nodeAdded = false;
    
    // Switch focus to the left child.
    // Manage focusNode tho.
    focusNode = focusNode.getChild(side);

    // If the left child has no children.
    if (focusNode == null) {
      // then place the new node on the left of it.
      parent.setChild(side, newNode);
      
      // We added the node. Let's git outta here yo.
      nodeAdded = true;
    }
    
    return nodeAdded;
  }

  protected void addLeft(Node parent, Node focusNode, Node newNode) {
    this.addChild("left", parent, focusNode, newNode);
  }

  protected void addRight(Node parent, Node focusNode, Node newNode) {
    this.addChild("right", parent, focusNode, newNode);
  }
}
