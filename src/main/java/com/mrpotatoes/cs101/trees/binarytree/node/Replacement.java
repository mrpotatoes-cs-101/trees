/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
   * @param replacedNode
   * @return
   */
	public static Node getReplacementNode(Node replacedNode) {
		Node replacementParent = replacedNode;
		Node replacement = replacedNode;
		Node focusNode = replacedNode.rightChild;

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

		if (replacement != replacedNode.rightChild) {
			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = replacedNode.rightChild;
		}

		return replacement;
	}
}
