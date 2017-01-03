package com.mrpotatoes.cs101.trees.binarytree.node;

/**
 *
 * @author alibresinn
 */
public class TraverseTree {
  /**
   *
   * Secretly this is the pre-order traverse. GASP!
   * @param focusNode
   */
  public void traverse(Node focusNode) {
    if (focusNode != null) {
			System.out.println(focusNode);

			this.traverse(focusNode.leftChild);
			this.traverse(focusNode.rightChild);
		}
  }

  /**
   *
   * @param focusNode
   */
  public void inOrderTraverseTree(Node focusNode) {
    if (focusNode != null) {
			// Traverse the left node
			this.traverse(focusNode.leftChild);

			// Visit the currently focused on node
			System.out.println(focusNode);

			// Traverse the right node
			this.traverse(focusNode.rightChild);
		}
  }

  /**
   *
   * @param focusNode
   */
  public void preorderTraverseTree(Node focusNode) {
    this.traverse(focusNode);
  }

  /**
   *
   * @param focusNode
   */
  public void postOrderTraverseTree(Node focusNode) {
    if (focusNode != null) {
			this.traverse(focusNode.leftChild);
			this.traverse(focusNode.rightChild);

			System.out.println(focusNode);
		}
  }
}
