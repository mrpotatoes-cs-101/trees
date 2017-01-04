// The original insertion.

//--------------------------------------------------------
// Check to insert left, otherwise insert right.
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
else {
  focusNode = focusNode.rightChild;

  // If the right child has no children.
  if (focusNode == null) {
    // Then place the new node on the right of it.
    parent.rightChild = newNode;
    return;
  }
}