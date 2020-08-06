package edu.escuelaing.arep.calculadoraestadistica.linkedlist;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

public class Node {
    private BigDecimal data;
    private Node leftNode;
    private Node rightNode;

    public Node(BigDecimal data){
        this.data = data;
        leftNode = null;
        rightNode = null;
    }

    public BigDecimal getData() {
        return data;
    }

    public void setData(BigDecimal data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
