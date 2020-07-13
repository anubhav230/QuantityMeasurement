package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    Feet feet;

    @Test
    public void givenUnit_ShouldReturnConvertedValue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
         double result = quantityMeasurement.covertUnit(2);
        Assert.assertEquals(24, result,0.0);
    }

    @Test
    public void givenSameUnit_ShouldReturnTrue() {
        Feet feet1 = new Feet(0);
        Feet feet2 = new Feet(0);
        Assert.assertEquals(feet1,feet2);
    }
}
