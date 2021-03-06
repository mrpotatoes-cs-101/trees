package com.mrpotatoes.cs101.trees.binarytree;

/**
 *
 * @author alibresinn
 */
public class Search {
  Node root;

  public Search(Node root) {
    this.root = root;
  }

  public Node findNode(int key) {
    // Start at the top of the tree
		Node focusNode = this.root;
		Node parent = this.root;

		// When searching for a Node this will tell us whether to search to the right or left
		boolean isItALeftChild = true;

		// While we haven't found the Node keep looking
		while (focusNode.key != key) {
			parent = focusNode;

			// If we should search to the left
			if (key < focusNode.key) {
				isItALeftChild = true;

				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;
			} else {
				// Greater than focus node so go to the right
				isItALeftChild = false;

				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;
			}

			// The node wasn't found
			if (focusNode == null) {
        return null;
      }
    }

    return focusNode;
  }

  // Find node by data.
  public Node findNode(String data) {
    Node focusNode = this.root;

    return focusNode;
  }

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
