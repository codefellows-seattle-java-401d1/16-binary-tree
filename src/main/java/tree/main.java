package tree;

public class main {
    public static void main(String[] args) {
        BinaryTree treeTest = new BinaryTree();
        treeTest.add(50);
        treeTest.add(25);
        treeTest.add(75);
        treeTest.add(15);
        treeTest.add(30);
        treeTest.add(16);
        treeTest.add(86);
        treeTest.add(45);
        treeTest.add(99);
        treeTest.add(100);
        treeTest.add(63);
        treeTest.add(19);
        treeTest.add(33);
        treeTest.add(37);
        treeTest.add(7);
        treeTest.add(2);
        treeTest.add(3);
        treeTest.add(4);
        treeTest.add(5);
        treeTest.add(6);
        System.out.println(treeTest.size());
        System.out.println(treeTest.sizeCheat(treeTest));
        System.out.println(treeTest.min());
        System.out.println(treeTest.minForUnorganized());
        System.out.println(treeTest.containsAlternate(7));
        System.out.println(treeTest.contains(7));


    }
}
