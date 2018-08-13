public class BinaryTree {
    protected TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    //included my add method from Whiteboard 16 to make building trees for tests easier
    public void add(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }
        this.add(value, this.root);
    }

    //updated after rewatching lecture as my WB 16 add method wasn't adding
    // in binary search tree fashion - it was making a "right leaning log"
    private void add(int value, TreeNode current) {

        // find a spot on the left
        if (current.left == null && value <= current.data) {
            current.left = new TreeNode(value);
            return;
        }

        // find a spot on the right
        if (current.right == null && value > current.data) {
            current.right = new TreeNode(value);
            return;
        }

        // recursive case: move through the tree
        // move left and right through the tree comparing values
        if (value <= current.data)  {
            add(value, current.left);
        } else if (value > current.data) {
            add(value, current.right);
        }
    }

    //from lecture works for only a binary search tree
    public int min() {
        TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
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

    //From re-watching lecture a few times
    //toString() is using the inOrder method instead of the pre or post
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
        postOrder(builder, current.left);
        postOrder(builder, current.right);
        builder.append(current.data + " ");

        return builder;
    }

    public int size(){
        if(this.root == null){
            return 0;
        }
        return this.size(this.root);
    }

    //rewritten after lab review in class
    // and re-watching lab review, once I better understood recursion
    //main wasn't working so I looked at classmates' submissions
    //I was missing the 1+ at the start - Thanks to Ahmed Ossan!
    private int size(TreeNode current){
        if(current == null){
            return 0;
        }
        return 1+ size(current.left) + size(current.right);
    }
}



