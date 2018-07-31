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

        // Connect nodes
        tree.root = n53;
        n53.left = n18;
        n18.left = n12;
        n18.right = n24;

        n53.right = n75;
        n75.left = n66;
        n75.right = n99;


        // Size of tree
        System.out.println("Size of tree: " + tree.size()); // expect 7

        // Minimum value in tree
        System.out.println("Minimum value in tree: " + tree.min()); // expect 12

        // Check if a specific value is in the tree
        System.out.println("Is the passed value in the tree?: " + tree.contains(7)); // expect false
        System.out.println("Is the passed value in the tree?: " + tree.contains(75)); // expect true

        // Example of toString method, which currently print inOrder
        System.out.println("toString inOder: " + tree.toString());

    }
}