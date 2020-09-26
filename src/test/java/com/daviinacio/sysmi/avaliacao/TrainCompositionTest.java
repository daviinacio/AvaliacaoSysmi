package com.daviinacio.sysmi.avaliacao;

import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author daviinacio
 */
public class TrainCompositionTest {
    private static TrainComposition trainComposition;
    
    @BeforeClass
    public static void setUpClass() {
        trainComposition = new TrainComposition();
    }
    
    @AfterClass
    public static void tearDownClass() {
        trainComposition = null;
    }
    
    @Test
    public void testDockWagonRight() {
        trainComposition.dockWagonRight(30);
        
        int wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(30, wagon);
    }
    
    @Test
    public void testDockWagonLeft() {
        trainComposition.dockWagonLeft(30);
        
        int wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(30, wagon);
    }

    @Test
    public void testUndockWagonRight() {
        trainComposition.dockWagonRight(5);
        trainComposition.dockWagonRight(8);
        trainComposition.dockWagonRight(4);
        
        int wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(4, wagon);
        
        wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(8, wagon);
        
        wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(5, wagon);
        
        
        // Cross test. Right -> Left
        trainComposition.dockWagonRight(5);
        trainComposition.dockWagonRight(8);
        trainComposition.dockWagonRight(4);
        
        wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(5, wagon);
        
        wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(8, wagon);
        
        wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(4, wagon);
    }
    
    @Test
    public void testUndockWagonLeft() {
        trainComposition.dockWagonLeft(2);
        trainComposition.dockWagonLeft(6);
        trainComposition.dockWagonLeft(7);
        
        int wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(7, wagon);
        
        wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(6, wagon);
        
        wagon = trainComposition.undockWagonLeft();
        Assert.assertEquals(2, wagon);
        
        
        // Cross test. Left -> Right
        trainComposition.dockWagonLeft(2);
        trainComposition.dockWagonLeft(6);
        trainComposition.dockWagonLeft(7);
        
        wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(2, wagon);
        
        wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(6, wagon);
        
        wagon = trainComposition.undockWagonRight();
        Assert.assertEquals(7, wagon);
    }
}
