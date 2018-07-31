package server;

public class main {
    public static void main(String[] args) {

//        BinaryTree tree = new BinaryTree();


    BinaryTree tree = new BinaryTree();
    TreeNode n53 = new TreeNode(53);

    TreeNode n18 = new TreeNode(18);
    TreeNode n12 = new TreeNode(12);
    TreeNode n24 = new TreeNode(24);

    TreeNode n75 = new TreeNode(75);
    TreeNode n66 = new TreeNode(66);
    TreeNode n99 = new TreeNode(99);

    TreeNode n7 = new TreeNode(7);
    TreeNode n13 = new TreeNode(13);
    TreeNode n65 = new TreeNode(65);
    TreeNode n14 = new TreeNode(14);
    TreeNode n15 = new TreeNode(15);
    TreeNode n16 = new TreeNode(16);


    // connect nodes

    tree.root =n53;
    n53.left =n18;
    n18.left =n12;
    n18.right =n24;

    n53.right =n75;
    n75.left =n66;
    n75.right =n99;

    n12.left = n7;
    n12.right = n13;
    n66.left = n65;
    n13.right = n14;
    n14.right = n15;
    n15.right = n16;

    tree.size();

        System.out.println(tree.size());
}
}
