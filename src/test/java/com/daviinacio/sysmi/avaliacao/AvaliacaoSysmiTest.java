package com.daviinacio.sysmi.avaliacao;

import org.junit.Test;

import org.junit.Assert;

/**
 * @author daviinacio
 */
public class AvaliacaoSysmiTest {
    @Test
    public void testCountNumbers() {
        int n = AvaliacaoSysmi.countNumbers(new int [] {1, 3, 42, -5, 7, -3, 3, 0 }, 3);
        
        Assert.assertEquals(4, n);
    }
}
