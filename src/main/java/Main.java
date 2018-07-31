public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode n53 = new TreeNode(53);

        TreeNode n18 = new TreeNode(18);
        TreeNode n12 = new TreeNode(12);
        TreeNode n24 = new TreeNode(24);

        TreeNode n75 = new TreeNode(75);
        TreeNode n66 = new TreeNode(66);
        TreeNode n99 = new TreeNode(99);

        // connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;

        // Check for initial size [x]
        System.out.println("Size of tree: " + tree.size());

        // Check the add function by adding then checking size again [x]
        tree.add(9);
        System.out.println("Size after adding 1 val: " + tree.size());

        // Check the contains method
        System.out.println("Check for 18: " + tree.contains(18));
        System.out.println("Check for a value not in the tree (51): " + tree.contains(51));

        // Check the min method
        System.out.println("Check for the min (9): " + tree.minVal());

        // Check the print method
        System.out.println("In order: " + tree.toString());
    }
}
