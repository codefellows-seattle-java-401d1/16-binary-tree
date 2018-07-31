package tree;

    public class Main {
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.add(12);
            tree.add(6);
            tree.add(2);
            tree.add(15);
            tree.add(16);
            tree.add(9);
            tree.add(22);
            tree.add(1);


            System.out.println("The size of the tree is:" + tree.size(tree.getRoot()));
        }
    }

