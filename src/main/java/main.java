
public class main {
    public static void main(String[] args) {

        //wiring up a tree from lab README
        BinaryTree myTestTree = new BinaryTree();
        myTestTree.add(53);
        myTestTree.add(18);
        myTestTree.add(12);
        myTestTree.add(24);
        myTestTree.add(75);
        myTestTree.add(66);
        myTestTree.add(99);

        System.out.println(myTestTree.toString());

        //this should return 7
        int size = myTestTree.size();
        System.out.println(size);

        //this should return false, since the tree doesn't contain the value 4
        boolean contains= myTestTree.contains(4);
        System.out.println(contains);
    }
}
