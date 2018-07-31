public class BinaryTree {
    public TreeNode root;

    // To String method that will recursively call either preOrder,
    // inOrder, and postOrder depending on the return type
    public String toString () {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    // Method to print strings in pre order
    private StringBuilder preOrder (StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + " ");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    // Method to print strings in order
    private StringBuilder inOrder (StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    // Method to print strings in post order
    private StringBuilder postOrder (StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        postOrder(builder, current.left);
        postOrder(builder, current.right);
        builder.append(current.data + " ");

        return builder;
    }

    // Build a method that returns the minimum value in a tree
    public int minVal () {
        TreeNode current = this.root;

        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // See if the tree contains a certain value
    public boolean contains (int val) {
        return this.contains(val, this.root);
    }

    private boolean contains (int val, TreeNode current) {
        if (current == null) {
            return false;
        }

        if (current.data == val) {
            return true;
        }

        boolean wasOnLeft = contains(val, current.left);
        boolean wasOnRight = contains(val, current.right);
        return wasOnLeft || wasOnRight;
    }

    // Get the size of the tree
    public int size () {
        return(size(root));
    }

    private int size (TreeNode current) {
        if (current == null) {
            return 0;
        } else {
            return(size(current.left) + size(current.right) + 1);
        }
    }

    // Add a node
    public void add(int val) {
        if (this.root == null) {
            this.root = new TreeNode(val);
            return;
        }
        this.add(val, this.root);
    }

    private void add(int val, TreeNode current) {
        if (current.left == null && val <= current.data) {
            current.left = new TreeNode(val);
            return;
        }

        // found a proper spot on the right!
        if (current.right == null && val > current.data) {
            current.right = new TreeNode(val);
            return;
        }

        // recursive case: move through the tree
        // move left and right through the tree comparing values.
        if (val <= current.data)  {
            add(val, current.left);
        } else if (val > current.data) {
            add(val, current.right);
        }
    }
}
