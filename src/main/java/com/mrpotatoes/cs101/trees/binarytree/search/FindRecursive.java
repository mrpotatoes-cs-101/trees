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
public class FindRecursive {
  public Node root;

  public FindRecursive(Node root) {
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

		return focusNode;
	}
}
