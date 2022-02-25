package Week7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TreeTest {

    @Test
    void test1() {
        Tree.Node root = null;
        root = Tree.insert(root, 50);
        Tree.insert(root, 30);
        Tree.insert(root, 20);
        Tree.insert(root, 40);
        Tree.insert(root, 70);
        Tree.insert(root, 60);
        Tree.insert(root, 80);


        Tree.inorder(root);
        int res= Tree.check();

        assertEquals(res,2);
    }
    @Test
    void test2() {
        Tree.Node root = null;
        root = Tree.insert(root, 50);
        Tree.insert(root, 30);
        Tree.insert(root, 20);
        Tree.insert(root, 40);
        Tree.insert(root, 70);
        Tree.insert(root, 60);
        Tree.insert(root, 80);
        Tree.insert(root, 120);
        Tree.insert(root, 130);



        Tree.inorder(root);
        int res= Tree.check();

        assertEquals(res,3);
    }

}