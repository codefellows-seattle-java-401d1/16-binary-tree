package tree;

public class BinaryTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }
        this.add(value, this.root);
    }

    // moving through the tree until we find a free
    // spot to place the new value.
    private void add(int value, TreeNode current) {
        // found a proper spot on the left!
        if (current.left == null && value <= current.data) {
            current.left = new TreeNode(value);
            return;
        }

        // found a proper spot on the right!
        if (current.right == null && value > current.data) {
            current.right = new TreeNode(value);
            return;
        }

        // recursive case: move through the tree
        // move left and right through the tree comparing values.
        if (value <= current.data) {
            add(value, current.left);
        } else if (value > current.data) {
            add(value, current.right);
        }
    }

    // sets up a pointer to the root node then always moves left
    // to get to the smallest value in the tree and returns it.
    public int min() {
        TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // same as min, but move right to get maximum value
    public int max() {
        TreeNode current = this.root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        return preOrder(builder, this.root).toString();
    }

    private StringBuilder preOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + " ");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    private StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    private StringBuilder postOrder(StringBuilder builder, TreeNode current) {
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

    private boolean contains(int value, TreeNode node) {
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

    public int size() {
        return size(root);
    }

    private int size(TreeNode treeNode) {
        int result;
            if (treeNode == null) {
                return 0;
            }
            else {
                result = (size(treeNode.left) + 1 + size(treeNode.right));
                return result;
            }
        }
// just a goofy cheat
    public int sizeCheat (BinaryTree testTree) {

        String string = testTree.toString();
        String[] arrayOfString = string.split(" ");
        return arrayOfString.length;
    }
//just a goofy cheat
    public int minForUnorganized() {
        String string = BinaryTree.this.toString();
        String[] arrayOfString = string.split(" ");
        int minimum = Integer.parseInt(arrayOfString[0]);
        for (int row = 0; row < arrayOfString.length; row++) {
            if (minimum > Integer.parseInt(arrayOfString[row])) {
                minimum = Integer.parseInt(arrayOfString[row]);
            }
        }
        return minimum;
    }
// just a goofy cheat
    public boolean containsAlternate(int value) {
        boolean run = true;
        String string = BinaryTree.this.toString();
        String[] arrayOfString = string.split(" ");
        for (int row = 0; row < arrayOfString.length; row++) {
            if (Integer.parseInt(arrayOfString[row]) == value) {
                run = true;
                return run;
            } else {
                run = false;
            }
        }
        return run;
    }
}

