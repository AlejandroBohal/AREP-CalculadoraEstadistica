package edu.escuelaing.arep.calculadoraestadistica.linkedlist;


import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>  {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;
    public LinkedList(){
    }
    public void add(E data){
        Node<E> node = new Node<E>(data);
        if (this.firstNode ==null){
            this.firstNode = node;
        }
        else{
            node.setLeftNode(this.lastNode);
            this.lastNode.setRightNode(node);
        }
        this.lastNode = node;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> currentNode = firstNode;

            public E next() {
                E currentData = currentNode.getData();
                currentNode = currentNode.getRightNode();
                return currentData;
            }

            public boolean hasNext() {
                return currentNode != null;
            }

            public void remove() {
            }
        };
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

}
