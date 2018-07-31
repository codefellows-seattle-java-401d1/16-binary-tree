package tree;


public class TreeNode {
    protected int data;
    protected TreeNode left;
    protected TreeNode right;

    //Creates new node
    public TreeNode(int value) {
        this.data = value;

    }

    //Returns the value of Data
    public int getData(){
        return data;
    }

    //Return the node to the left of current node
    public TreeNode getLeft(){
        return this.left;
    }

    //Returns the node to the right of the current node
    public TreeNode getRight(){
        return this.right;
    }

    //Prints data
    public String toString(){
        return "" + this.data;
    }
}
