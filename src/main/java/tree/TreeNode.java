package tree;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.data = value;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public String toString() {
        return "" + this.data;
    }
}
