public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    // Assign a specific value to a node
    public TreeNode(int value) {
        this.data = value;
    }

    // Returns the value of node
    public int getData() {
        return data;
    }

    // Returns the node to the left
    public TreeNode getLeft() {
        return this.left;
    }

    // Returns the node to the right
    public TreeNode getRight() {
        return this.right;
    }

    // Returns the node as a String
    public String toString() {
        return "" + this.data;
    }
}
