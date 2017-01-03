package com.mrpotatoes.cs101.trees.binarytree;

/**
 *
 * @author alibresinn
 */
public interface BinaryContract {
  public void addNode(int key, String name);
  public void inOrderTraverseTree(Node focusNode);
  public void preorderTraverseTree(Node focusNode);
  public void postOrderTraverseTree(Node focusNode);
  public Node findNode(int key);
  public boolean remove(int key);
  // public Node getReplacementNode(Node replacedNode);
}
