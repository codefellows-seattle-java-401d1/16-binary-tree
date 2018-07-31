public class BinaryTree {
    private TreeNode root;

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

}
