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
