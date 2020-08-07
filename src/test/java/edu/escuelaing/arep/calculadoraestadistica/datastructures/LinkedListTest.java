package edu.escuelaing.arep.calculadoraestadistica.datastructures;

import edu.escuelaing.arep.calculadoraestadistica.calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListTest {
    LinkedList<Double> dataSet1,dataSet2;
    LinkedList<BigDecimal> dataSet3;
    LinkedList<String> dataSet5,dataSet6;
    @Before
    public void setup(){

        dataSet1 = new LinkedList<Double>();
        dataSet2 = new LinkedList<Double>();
        dataSet3 = new LinkedList<BigDecimal>();
        dataSet5 = new LinkedList<String>();
        dataSet6 = new LinkedList<String>();
    }
    @Test
    public void shouldCreateLinkedList(){
        String classTest = "class " + "edu.escuelaing.arep.calculadoraestadistica.datastructures.LinkedList";
        Assert.assertEquals(dataSet1.getClass().toString(),classTest);
        Assert.assertNotNull(dataSet1);
    }
    @Test
    public void shouldAddToLinkedList(){
        double[] doubles = {2.44,0.04,0.03,0.12,1.33,3.12};
        dataSet1.add(2.44);
        dataSet1.add(0.04);
        dataSet1.add(0.03);
        dataSet1.add(0.12);
        dataSet1.add(1.33);
        dataSet1.add(3.12);
        Assert.assertEquals(dataSet1.getSize(),6);
        for(int i =0 ; i<dataSet1.getSize(); i++){
            Assert.assertEquals(doubles[i],dataSet1.get(i),0.0);
        }

    }
    @Test
    public void shouldAddWithOrder(){
        dataSet2.add(0.0);
        double data1 = dataSet2.get(0);
        Assert.assertEquals(data1,(double) dataSet2.getFirstNode().getData(),0.0);
        Assert.assertEquals(data1,(double) dataSet2.getLastNode().getData(),0.0);
        dataSet2.add(0.3);
        dataSet2.add(0.4);
        Assert.assertEquals(dataSet2.get(1),0.3,0.0);
        Assert.assertEquals(dataSet2.get(2),0.4,0.0);
    }
    @Test
    public void shouldGetNext(){
        dataSet5.add("Hello");
        dataSet5.add("World");
        dataSet5.add(":)");
        Iterator<String> iterator =  dataSet5.iterator();
        Assert.assertEquals(iterator.next(),"Hello");
        Assert.assertEquals(iterator.next(),"World");
        Assert.assertEquals(iterator.next(),":)");
    }
    @Test
    public void shouldDoRemove(){
        dataSet3.add(new BigDecimal("0.15"));
        dataSet3.add(new BigDecimal("0.13"));
        dataSet3.add(new BigDecimal("0.12"));
        Assert.assertEquals(dataSet3.remove(),new BigDecimal("0.15"));
        Assert.assertEquals(dataSet3.getSize(),2);
        Assert.assertEquals(dataSet3.getFirstNode().getData(),new BigDecimal("0.13"));
        Assert.assertEquals(dataSet3.remove(),new BigDecimal("0.13"));
        Assert.assertEquals(dataSet3.getSize(),1);
        Assert.assertEquals(dataSet3.getLastNode().getData(),new BigDecimal("0.12"));
        dataSet3.remove();
        try{
            dataSet3.remove();
            Assert.fail();
        }catch (NoSuchElementException e){
            System.out.println("hola");
            Assert.assertTrue(true);
        }

    }
    @Test
    public void shouldGetSize(){
        Assert.assertEquals(dataSet6.getSize(),0);
        dataSet6.add("Size 1");
        Assert.assertEquals(dataSet6.getSize(),1);
        dataSet6.remove();
        Assert.assertEquals(dataSet6.getSize(),0);
        dataSet6.add("Size 2");
        dataSet6.add("");
        Assert.assertEquals(dataSet6.getSize(),2);
    }
}
