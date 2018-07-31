public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(45);
        TreeNode n4 = new TreeNode(20);
        TreeNode n5 = new TreeNode(3);

        tree.root = n2;
        n2.left = n1;
        n2.right = n3;
        n3.left = n4;
        n1.right = n5;

        System.out.println("preOrder");
        tree.preOrder(n2);
        System.out.println();

        System.out.println("inOrder:");
        tree.inOrder(n2);
        System.out.println();

        System.out.println("postOrder:");
        tree.postOrder(n2);
        System.out.println();

        System.out.println("toString:");
        tree.toString(n2);
        System.out.println();

        System.out.println("size:");
        tree.size(n2);
        System.out.println();

        System.out.println("min:");
        tree.min();
        System.out.println();

        System.out.println("contains:");
        tree.contains(3);
        System.out.println();
    }
}
