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
    public void givenSameUnitGFeet_ShouldThrowException() {
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
    public void givenDifferentReferences_FromSameType_ShouldNotEqual() {
        Unit feet1 = new Unit(Unit.Type.FEET,2.0);
        Unit feet2 = new Unit(Unit.Type.FEET,2.0);
        Assert.assertNotEquals(feet1, equals(feet2));
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
        Unit inch1 = new Unit(Unit.Type.INCH,1.0);
        Unit inch2 = new Unit(Unit.Type.INCH,1.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenSameUnitInch_ShouldThrowException() {
        try {
            Unit inch1 = new Unit(Unit.Type.INCH,0.0);
            Unit inch2 = new Unit(Unit.Type.INCH,null);
            Assert.assertEquals(inch1, inch2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameInchReference_ShouldBeEqual() {
        Unit inch1 = new Unit(Unit.Type.INCH,2.0);
        Unit inch2 = new Unit(Unit.Type.INCH,2.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenDifferentFeetAndInchType_ShouldNotBeEqual() {
        Unit feet = new Unit(Unit.Type.INCH,2.0);
        Unit inch = new Unit(Unit.Type.FEET,2.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenThreeFeetAndOneYard_ShouldBeEqual() {
        Unit yard = new Unit(Unit.Type.YARD,1.0);
        Unit feet = new Unit(Unit.Type.FEET,3.0);
        boolean result = yard.unitConversion(feet);
        Assert.assertTrue(result);
    }

    @Test
    public void givenOneFeetAndOneYard_AreNotEqual() {
        Unit yard = new Unit(Unit.Type.YARD,1.0);
        Unit feet = new Unit(Unit.Type.FEET,1.0);
        boolean result = yard.unitConversion(feet);
        Assert.assertFalse(result);
    }

    @Test
    public void givenOnInchAndOneYard_ShouldNotBeEqual() {
        Unit yard = new Unit(Unit.Type.YARD,1.0);
        Unit inch = new Unit(Unit.Type.INCH,1.0);
        boolean result = yard.unitConversion(inch);
        Assert.assertFalse(result);
    }

    @Test
    public void givenInchAndYard_ShouldBeEqualAfterConverting() {
        Unit yard = new Unit(Unit.Type.YARD,1.0);
        Unit inch = new Unit(Unit.Type.INCH,36.0);
        boolean result = yard.unitConversion(inch);
        Assert.assertTrue(result);
    }
}
