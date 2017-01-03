/**
 * Find a replacement node.
 */
package com.mrpotatoes.cs101.trees.binarytree.node;

import com.mrpotatoes.cs101.trees.binarytree.Node;

/**
 *
 * @author alibresinn
 */
public class Replacement {
  /**
   *
   * @param node
   * @return
   */
	public static Node getReplacementNode(Node node) {
		Node replacementParent = node;
		Node replacement = node;
		Node focusNode = node.rightChild;

		// While there are no more left children
		while (focusNode != null) {
			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.leftChild;
		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild

		if (replacement != node.rightChild) {
			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = node.rightChild;
		}

		return replacement;
	}
}
