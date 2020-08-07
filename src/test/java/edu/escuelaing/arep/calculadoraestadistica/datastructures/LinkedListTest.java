package edu.escuelaing.arep.calculadoraestadistica.datastructures;
import java.util.LinkedList;

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

        System.out.println("Prueba1");
        for(BigDecimal i: linkedList){
           System.out.println(i);
        }
        System.out.println("Prueba1");

        System.out.println(linkedList.remove());
        System.out.println(linkedList.remove());
        System.out.println(linkedList.remove());

        System.out.println("Prueba2");
        for(BigDecimal i: linkedList){
            System.out.println(i);
        }
        System.out.println("Prueba2");
    }
}
