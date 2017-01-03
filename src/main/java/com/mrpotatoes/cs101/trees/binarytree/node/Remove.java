package com.mrpotatoes.cs101.trees.binarytree.node;

import com.mrpotatoes.cs101.trees.binarytree.Search;
import com.mrpotatoes.cs101.trees.binarytree.Node;

/**
 *
 * @author alibresinn
 */
public class Remove {
  Node root;

  /**
   * Remove a child from the tree.
   *
   * Order of Operations: (turn each of these into their own method).
   *    While we haven't found the Node keep looking
   *    If Node doesn't have children delete it
   *    If no right child
   *    If no left child
   *    Two children so I need to find the deleted nodes replacement
   * @param key
   * @return
   */
	public boolean remove(int key) {
    Search finder = new Search(root);
		Node focusNode = finder.findNode(key);
		Node parent = root;

		if (focusNode == null) {
      return false;
    }

		// If Node doesn't have children delete it
    // If no left child
    // Two children so I need to find the deleted nodes replacement

		if (this.isChildless(focusNode)) {
      this.removeChildless();
		}
		else if (focusNode.rightChild == null) {
      this.removeRightless();
		}
		else if (focusNode.leftChild == null) {
			this.removeLeftless();
		}
		else {
      this.removeWithChildren();
		}

		return true;
	}

  /**
   * 
   * @param focusNode
   * @return
   */
  protected boolean isChildless(Node focusNode) {
    return focusNode.leftChild == null && focusNode.rightChild == null;
  }

  /**
   *
   */
  protected void removeRightless() {
    // If focus Node was on the left of parent move the focus Nodes left child up to the parent node
    // Vice versa for the right child
    /*if (focusNode == root) {
      root = focusNode.leftChild;
    }

    else if (isItALeftChild) {
      parent.leftChild = focusNode.leftChild;
    }
    else {
      parent.rightChild = focusNode.leftChild;
    } //*/
  }

  /**
   *
   */
  protected void removeLeftless() {
    // If focus Node was on the left of parent move the focus Nodes right child up to the parent node
    // Vice versa for the left child
    /*if (focusNode == root) {
      root = focusNode.rightChild;
    }
    else if (isItALeftChild) {
      parent.leftChild = focusNode.rightChild;
    }
    else {
      parent.rightChild = focusNode.rightChild;
    } //*/
  }

  /**
   *
   */
  protected void removeChildless() {
    // If root delete it
    // If it was marked as a left child of the parent delete it in its parent
    // Vice versa for the right child
    /*if (focusNode == root) {
      root = null;
    }
    else if (isItALeftChild) {
      parent.leftChild = null;
    }
    else {
      parent.rightChild = null;
    } //*/
  }

  /**
   *
   */
  protected void removeWithChildren() {
    // If the focusNode is root replace root with the replacement
    // If the deleted node was a left child make the replacement the left child
    // Vice versa if it was a right child
    /*Node replacement = Replacement.getReplacementNode(focusNode);

    if (focusNode == root) {
      root = replacement;
    }
    else if (isItALeftChild) {
      parent.leftChild = replacement;
    }
    else {
      parent.rightChild = replacement;
    }

    replacement.leftChild = focusNode.leftChild; //*/
  }
}
