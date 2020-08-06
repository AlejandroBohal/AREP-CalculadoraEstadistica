package edu.escuelaing.arep.calculadoraestadistica.linkedlist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

public class Node<E> {
    private E data;
    private Node<E> leftNode;
    private Node<E> rightNode;

    public Node(E data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<E> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<E> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<E> rightNode) {
        this.rightNode = rightNode;
    }
}
