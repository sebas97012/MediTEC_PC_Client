package datastructures.binarytree;

/**
 * Created by Arturo on 22/4/2017.
 */
public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode root; //Raiz del arbol

    /**
     * Constructor
     */
    public BinaryTree(){
        this.root = null;
    }

    public BinaryNode getRoot() {
        return root;
    }}