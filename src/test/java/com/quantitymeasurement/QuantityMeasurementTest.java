package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenUnit_ShouldReturnConvertedValue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
         double result = quantityMeasurement.covertUnit(1.2);
        Assert.assertEquals(14.3, result,0.0);
    }
}
