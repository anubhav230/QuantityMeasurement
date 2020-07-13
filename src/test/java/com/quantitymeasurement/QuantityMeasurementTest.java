package com.quantitymeasurement;

import com.quantitymeasurement.services.Unit;
import com.quantitymeasurement.services.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void givenUnit_ShouldReturnConvertedValue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double result = quantityMeasurement.covertUnit(2);
        Assert.assertEquals(24, result, 0.0);
    }


    @Test
    public void givenSameUnit_ShouldReturnTrue() {
        Unit feet1 = new Unit(Unit.Type.FEET,0.0);
        Unit feet2 = new Unit(Unit.Type.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameUnit_ShouldReturnNotEqual() throws NullPointerException {
        try {
            Unit unit1 = new Unit(Unit.Type.FEET,0.0);
            Unit unit2 = new Unit(Unit.Type.FEET,null);
            Assert.assertEquals(unit1, unit2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenReferences_ShouldCompareReference() {
        Unit feet1 = new Unit(Unit.Type.FEET,2.0);
        Unit feet2 = new Unit(Unit.Type.FEET,2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenReferences_ShouldCompareType() {
        Unit feet1 = new Unit(Unit.Type.FEET,2.0);
        Unit feet2 = new Unit(Unit.Type.FEET,2.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenDifferentType_ShouldNotEqual() {
        Unit feet1 = new Unit(Unit.Type.FEET,0.0);
        Unit feet2 = new Unit(Unit.Type.INCH,0.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenDifferentValueOfSameUnit_ShouldNotEqual() {
        Unit feet1 = new Unit(Unit.Type.FEET,2.0);
        Unit feet2 = new Unit(Unit.Type.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    //test case for inch
    @Test
    public void givenSameInch_ShouldBeEqual() {
        Unit feet1 = new Unit(Unit.Type.INCH,1.0);
        Unit feet2 = new Unit(Unit.Type.INCH,1.0);
        Assert.assertEquals(feet1, feet2);
    }

}
