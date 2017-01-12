/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mrpotatoes.cs101.trees.binarytree.search;

import com.mrpotatoes.cs101.trees.binarytree.Node;

/**
 *
 * @author alibresinn
 */
public class FindLoop {
  public Node root;

  public FindLoop(Node root) {
    this.root = root;
  }

  /**
   *
   * @param key
   * @return
   */
	public Node find(int key) {
		// Start at the top of the tree
		Node focusNode = this.root;

		// While we haven't found the Node keep looking.
		while (focusNode.key != key) {
			// If we should search to the left
			if (key < focusNode.key) {
				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;
			}
      else {
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
}
