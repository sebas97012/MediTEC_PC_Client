package datastructures.avltree;

/**
 * Created by Arturo on 7/5/2017.
 */
public class AVLTree<T extends Comparable<T>> {
    private AVLNode root;

    public AVLTree(){
        this.root = null;
    }

    public AVLNode getRoot() {
        return root;
    }
}