package com.mrpotatoes.cs101.trees.binarytree;

/**
 * Binary tree class.
 *
 * This class is essentially a wrapper class for all the helper classes/methods
 * for a binary tree. This class on it's own only sets the main root node
 * everything else is just simply a way to traverse and work with the tree.
 *
 * @author Andric LibreSinn
 * @author Derek Banas
 * @see https://www.youtube.com/watch?v=M6lYob8STMI
 */
public class Binary implements BinaryContract {
	Node root;

  public void insert(int key, String name) {
    this.addNode(key, name);
  }

  public boolean delete(int key) {
    return this.remove(key);
  }

  /**
   * @param key
   * @param name
   * @todo Re-factor me so that it's simpler maybe.
   */
	public void addNode(int key, String name) {
		// Create a new Node and initialize it
		Node newNode = new Node(key, name);

		// If there is no root this becomes root
		if (root == null) {
			root = newNode;
		}
    else {
			// Set root as the Node we will start with as we traverse the tree.
			Node focusNode = root;

			// Future parent for our new Node.
			Node parent;

			while (true) {
				// root is the top parent so we start there.
				parent = focusNode;

				// Check if the new node should go on the left side of the parent node.
				if (key < focusNode.key) {
					// Switch focus to the left child.
					focusNode = focusNode.leftChild;

					// If the left child has no children.
					if (focusNode == null) {
            // then place the new node on the left of it.

						parent.leftChild = newNode;
						return;
					}
				}
        // If we get here put the node on the right
        else {
					focusNode = focusNode.rightChild;

					// If the right child has no children.
					if (focusNode == null) {
						// Then place the new node on the right of it.
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	/**
   * In order traverse.
   *
   * All nodes are visited in ascending order Recursion is used to go to one
   * node and then go to its child nodes and so forth.
   *
   * @param focusNode
   */
	public void inOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			// Traverse the left node
			preorderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node
			System.out.println(focusNode);

			// Traverse the right node
			preorderTraverseTree(focusNode.rightChild);
		}
	}

  /**
   *
   * @param focusNode
   */
	public void preorderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);

			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}

  /**
   *
   * @param focusNode
   */
	public void postOrderTraverseTree(Node focusNode) {
		if (focusNode != null) {
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);
		}
	}

  /**
   *
   * @param key
   * @return
   */
	public Node findNode(int key) {
		// Start at the top of the tree
		Node focusNode = root;

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
		// Start at the top of the tree
		Node focusNode = root;
		Node parent = root;

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
			}
      else {
				// Greater than focus node so go to the right
				isItALeftChild = false;

				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;
			}

			// The node wasn't found.
			if (focusNode == null) {
        return false;
      }
		}

		// If Node doesn't have children delete it
		if (focusNode.hasChildren()) {
			// If root delete it
			if (focusNode == root) {
        root = null;
      }
			else if (isItALeftChild) {
        // If it was marked as a left child of the parent delete it in its parent
        parent.leftChild = null;
      }
      else {
        // Vice versa for the right child
        parent.rightChild = null;
      }
		}
		// If no right child
		else if (focusNode.rightChild == null) {
			if (focusNode == root) {
        // If focus Node was on the left of parent move the focus Nodes left child up to the parent node
        root = focusNode.leftChild;
      }

			else if (isItALeftChild) {
        parent.leftChild = focusNode.leftChild;
      }
      else {
        // Vice versa for the right child
				parent.rightChild = focusNode.leftChild;
      }
		}
		// If no left child
		else if (focusNode.leftChild == null) {
			if (focusNode == root) {
        root = focusNode.rightChild;
      }
			else if (isItALeftChild) {
        // If focus Node was on the left of parent move the focus Nodes right child up to the parent node
        parent.leftChild = focusNode.rightChild;
      }
      else {
        // Vice versa for the left child
        parent.rightChild = focusNode.rightChild;
      }
		}
    // Two children so I need to find the deleted nodes replacement
		else {
      // Node replacement = getReplacementNode(focusNode); // Original.
//			Node replacement = Replacement.getReplacementNode(focusNode);
//
//			// If the focusNode is root replace root with the replacement
//			if (focusNode == root) {
//        root = replacement;
//      }
//			else if (isItALeftChild) {
//        // If the deleted node was a left child make the replacement the left child
//        parent.leftChild = replacement;
//      }
//      else {
//        // Vice versa if it was a right child
//        parent.rightChild = replacement;
//      }
//
//			replacement.leftChild = focusNode.leftChild;
		}

		return true;
	}

  /**
   *
   * @param replacedNode
   * @return
   */
	/*public Node getReplacementNode(Node replacedNode) {
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
	} */
}
