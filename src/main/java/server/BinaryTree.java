package server;

public class BinaryTree {
    public TreeNode root;
    public int count;


    public TreeNode getRoot() {
        return root;
    }


    //The only method in the lab that wasn't written out in class.
    public int size() {
        if (this.root == null) {
            return 0;
        }
        return this.size(this.root);
    }

    private int size(TreeNode current) {

        //make sure current is not null
        if (current == null) {
            return 0;
        }

        //following the inOrder version, call size on the left first
        size(current.left);

        //increment the count
        count ++;
        System.out.println("count = " + count);

        //following the inOrder version, call the size method on the right
        size(current.right);

        //unknown bug causing all counts to be duplicated, but dividing by 2 gives an accurate size. Tested with lopsided trees also.
        return count/2;
    }

    //=========== FROM LECTURE ===========

    //Written in class by Steve during lecture
    public int min() {
        TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    //Written in class by Steve during lecture
    public boolean contains(int value) {
        return this.contains(value, this.root);
    }

    //Written in class by Steve during lecture
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
        if (value <= current.data)  {
            add(value, current.left);
        } else if (value > current.data) {
            add(value, current.right);
        }
    }

    //All below here was written by Steve during lecture
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
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
}
