package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void size() {
        BinaryTree tree = new BinaryTree();
        tree.add(12);
        tree.add(6);
        tree.add(2);
        tree.add(15);
        tree.add(9);
        tree.add(22);
        tree.add(1);

        int results = tree.size(tree.getRoot());

        System.out.println("The tree has " + tree.size(tree.getRoot()) + " Nodes in it.");
        assertEquals(7, results);

    }

    @Test
    public void sizeEmpty() {
        BinaryTree tree = new BinaryTree();


        int results = tree.size(tree.getRoot());

        System.out.println("The tree has " + tree.size(tree.getRoot()) + " Nodes in it.");
        assertEquals(0, results);

    }

    @Test
    public void sizeOne() {
        BinaryTree tree = new BinaryTree();
        tree.add(15);



        int results = tree.size(tree.getRoot());

        System.out.println("The tree has " + tree.size(tree.getRoot()) + " Nodes in it.");
        assertEquals(1, results);

    }
}