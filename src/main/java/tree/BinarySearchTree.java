package tree;

public class BinarySearchTree {
    private tree.TreeNode root;

    public tree.TreeNode getRoot() {
        return root;
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new tree.TreeNode(value);
            return;
        }
        this.add(value, this.root);
    }

    // moving through the tree until we find a free
    // spot to place the new value.
    private void add(int value, tree.TreeNode current) {
        // found a proper spot on the left!
        if (current.left == null && value <= current.data) {
            current.left = new tree.TreeNode(value);
            return;
        }

        // found a proper spot on the right!
        if (current.right == null && value > current.data) {
            current.right = new tree.TreeNode(value);
            return;
        }

        // recursive case: move through the tree
        // move left and right through the tree comparing values.
        if (value <= current.data)  {
            add(value, current.left);
        } else if (value > current.data) {
            add(value, current.right);
        }
    }

    // sets up a pointer to the root node then always moves left
    // to get to the smallest value in the tree and returns it.
    public int min() {
        tree.TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // same as min, but move right to get maximum value
    public int max() {
        tree.TreeNode current = this.root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder preOrder(StringBuilder builder, tree.TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + " ");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    private StringBuilder inOrder(StringBuilder builder, tree.TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    private StringBuilder postOrder(StringBuilder builder, tree.TreeNode current) {
        if (current == null) {
            return builder;
        }

        preOrder(builder, current.left);
        preOrder(builder, current.right);
        builder.append(current.data + " ");

        return builder;
    }

    public boolean contains(int value) {
        return this.contains(value, this.root);
    }

    private boolean contains(int value, tree.TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.data == value) {
            return true;
        }

        boolean wasOnLeft = contains(value, node.left);
        boolean wasOnRight = contains(value, node.right);
        return wasOnLeft || wasOnRight;
    }

    public int size(tree.TreeNode node) {

        int total = 0;

        if (node == null) {
            return 0;
        } else {
            // Count all nodes on the left of the tree plus all the nodes on the right plus the root of course.
            total = (size(node.left) + size(node.right) + 1);
        }
        System.out.println(total);
        return total;
    }
}




















