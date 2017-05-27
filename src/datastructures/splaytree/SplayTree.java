package datastructures.splaytree;

/**
 * Created by Arturo on 8/5/2017.
 */
public class SplayTree<T extends Comparable> {
    private SplayNode root;

    /**
     * Constructor
     */
    public SplayTree() {
        this.root = null;
    }

    public SplayNode getRoot() {
        return this.root;
    }
}