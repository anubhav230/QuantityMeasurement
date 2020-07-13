package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.services.Feet;
import com.quantitymeasurement.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


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
    @Test
    public void givenSameUnit_ShouldReturnNotEqual() {
               Feet feet1 = new Feet(0);
               Assert.assertNotEquals(feet1, null);
    }
}
