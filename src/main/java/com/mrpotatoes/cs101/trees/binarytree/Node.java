package com.mrpotatoes.cs101.trees.binarytree;

/**
 * Make this with a map version so that the code is even easier to work with.
 * 
 * @author alibresinn
 */
public class Node {
	public int key;
	public String name;

	public Node leftChild;
	public Node rightChild;

  /**
   * 
   * @param key
   * @param name 
   */
	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
  
  /**
   * 
   * @return 
   */
  public String getData() {
    return this.name;
  }

  /**
   * 
   * @param side
   * @return 
   */
  public Node getChild(String side) {
    Node child = null;

    if (side.equals("left")) {
      child = this.leftChild;
    }
    else if (side.equals("right")) {
      child = this.rightChild;
    }

    return child;
  }

  /**
   * 
   * @param side
   * @param node 
   */
  public void setChild(String side, Node node) {
    if (side.equals("left")) {
      this.leftChild = node;
    }
    else if (side.equals("right")) {
      this.rightChild = node;
    }
  }

  /**
   * Yeah, check this. I didn't bother.
   * 
   * @return 
   */
  public boolean noRightChild() {
    return this.rightChild == null;
  }

  /**
   * Yeah, check this. I didn't bother.
   * 
   * @return 
   */
  public boolean noLeftChild() {
    return this.leftChild == null;
  }

  /**
   * 
   * @return 
   */
  public boolean hasChildren() {
    return this.leftChild == null && this.rightChild == null;
  }

  /**
   * return name + " has the key " + key + "\nLeft Child: " + leftChild +
   * "\nRight Child: " + rightChild + "\n";
   *
   * @return
   */
  @Override
	public String toString() {
		return name + " has the key " + key;
	}
}
