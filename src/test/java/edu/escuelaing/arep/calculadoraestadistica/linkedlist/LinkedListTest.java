package edu.escuelaing.arep.calculadoraestadistica.linkedlist;


import org.junit.Test;

import java.math.BigDecimal;

public class LinkedListTest {
    @Test
    public void shouldCreateLinkedList(){
        LinkedList<BigDecimal> linkedList = new LinkedList<BigDecimal>();
        linkedList.add(new BigDecimal("0.33"));
        linkedList.add(new BigDecimal("0.34"));
        linkedList.add(new BigDecimal("0.35"));
        linkedList.add(new BigDecimal("0.36"));
        for(BigDecimal i: linkedList){
           System.out.println(i);
        }
    }
}
