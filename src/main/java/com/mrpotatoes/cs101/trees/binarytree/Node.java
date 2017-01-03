package com.mrpotatoes.cs101.trees.binarytree;

// Make this with a map version so that the code is even easier to work with.
public class Node {
	public int key;
	public String name;

	public Node leftChild;
	public Node rightChild;

	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

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

  public void setChild(String side, Node node) {
    if (side.equals("left")) {
      this.leftChild = node;
    }
    else if (side.equals("right")) {
      this.rightChild = node;
    }
  }

  // Yeah, check this. I didn't bother.
  public boolean noRightChild() {
    return this.rightChild == null;
  }

  // Yeah, check this. I didn't bother.
  public boolean noLeftChild() {
    return this.leftChild == null;
  }

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
