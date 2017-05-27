package datastructures.avltree;

import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 * Created by Arturo on 7/5/2017.
 */
public class AVLNode<T extends Comparable<T>> {
    @JsonTypeInfo( use = Id.CLASS, include = As.WRAPPER_OBJECT)
    private T data;
    private int balanceFactor;
    private AVLNode left;
    private AVLNode right;

    public AVLNode(){

    }

    public AVLNode(T data){
        this.data = data;
        this.balanceFactor = 0;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getBalanceFactor() {
        return balanceFactor;
    }

    public void setBalanceFactor(int balanceFactor) {
        this.balanceFactor = balanceFactor;
    }

    public AVLNode getLeft() {
        return left;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }
}
