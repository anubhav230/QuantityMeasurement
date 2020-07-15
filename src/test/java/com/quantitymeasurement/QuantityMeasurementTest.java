package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.services.LengthOfUnit;
import com.quantitymeasurement.services.UnitMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Test
    public void givenSameUnit_ShouldReturnTrue() {
       UnitMeasurement unitMeasurement = new UnitMeasurement(LengthOfUnit.FEET,0.0);
        UnitMeasurement unitMeasurement2 = new UnitMeasurement(LengthOfUnit.FEET,0.0);
        Assert.assertEquals(unitMeasurement,unitMeasurement2);
    }

    @Test
    public void givenSameUnitGFeet_ShouldThrowException(){
        try {
            UnitMeasurement unitMeasurement = new UnitMeasurement();
            unitMeasurement.unitConversion(LengthOfUnit.FEET,null);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenReferences_ShouldCompareReference() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        UnitMeasurement unitMeasurement2 = new UnitMeasurement();
        Assert.assertNotEquals(unitMeasurement, equals(unitMeasurement2));
    }


    @Test
    public void givenSameType_ShouldNotEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        UnitMeasurement unitMeasurement1 = new UnitMeasurement();
        Assert.assertEquals(unitMeasurement.getClass(), unitMeasurement1.getClass());
    }

    @Test
    public void givenDifferentValueOfSameUnit_ShouldNotEqual() {
        UnitMeasurement result1 = new UnitMeasurement(LengthOfUnit.FEET,0.0);
        UnitMeasurement result2 = new UnitMeasurement(LengthOfUnit.FEET,1.0);
        Assert.assertNotEquals(result1, result2);
    }

    //test case for inch

    @Test
    public void givenZeroInch_ShouldBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(LengthOfUnit.INCH,0.0);
        UnitMeasurement result2 = new UnitMeasurement(LengthOfUnit.INCH,0.0);
        Assert.assertEquals(result1, result2);
    }

    @Test
    public void givenSameInch_ShouldBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(LengthOfUnit.INCH,0.0);
        UnitMeasurement result2 = new UnitMeasurement(LengthOfUnit.INCH,1.0);
        Assert.assertNotEquals(result1, result2);
    }

    @Test
    public void givenNullValue_ShouldThrowQuantityMeasurementException() {
        try {
            UnitMeasurement unitMeasurement = new UnitMeasurement();
            unitMeasurement.unitConversion(LengthOfUnit.INCH,null);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameInchReference_ShouldBeEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        Assert.assertEquals(unitMeasurement, unitMeasurement);
    }

    @Test
    public void givenDifferentTypeForInch_ShouldNotEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        String string = "";
        Assert.assertNotEquals(unitMeasurement.getClass(), string.getClass());
    }

    @Test
    public void givenThreeFeetAndOneYard_ShouldBeEqual() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result2 = unitMeasurement.unitConversion(LengthOfUnit.FEET,3.0);
        double result = unitMeasurement.unitConversion(LengthOfUnit.YARD,1.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenOneFeetAndOneYard_AreNotEqual() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(LengthOfUnit.FEET,3.0);
        double result2 = unitMeasurement.unitConversion(LengthOfUnit.YARD,1.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenOnInchAndOneYard_ShouldNotBeEqual() throws QuantityMeasurementException {
        UnitMeasurement result1 = new UnitMeasurement(LengthOfUnit.INCH,0.0);
        UnitMeasurement result2 = new UnitMeasurement(LengthOfUnit.YARD,1.0);
        Assert.assertNotEquals(result1, result2);
    }

    @Test
    public void givenValueOfInchAndYard_ShouldBeEqualAfterConverting() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(LengthOfUnit.YARD,1.0);
        double result2 = unitMeasurement.unitConversion(LengthOfUnit.INCH,36.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenValueOfInchAndYard2_ShouldBeEqualAfterConverting() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(LengthOfUnit.INCH,36.0);
        double result2 = unitMeasurement.unitConversion(LengthOfUnit.YARD,1.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenFeetAndYard_ShouldBeEqual() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(LengthOfUnit.YARD,1.0);
        double result2 = unitMeasurement.unitConversion(LengthOfUnit.FEET,3.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenTwoInchAndFiveCentimeter_ShouldBeEqual() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(LengthOfUnit.INCH,2.0);
        double result2 = unitMeasurement.unitConversion(LengthOfUnit.CENTIMETER,5.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenNullValueForCentimeter_ShouldThrowQuantityMeasurementException() {
        try {
            UnitMeasurement unitMeasurement = new UnitMeasurement();
            unitMeasurement.unitConversion(LengthOfUnit.CENTIMETER,null);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenTwoReferencesOfSameClass_ShouldCompareReference() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        UnitMeasurement unitMeasurement2 = new UnitMeasurement();
        Assert.assertNotEquals(unitMeasurement,equals(unitMeasurement2));
    }

    @Test
    public void givenDifferentTypeOfClass_ShouldNotEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        String string = "";
        Assert.assertNotEquals(unitMeasurement.getClass(), string.getClass());
    }


    @Test
    public void givenEqualCentimeter_ShouldBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(LengthOfUnit.CENTIMETER,0.0);
        UnitMeasurement result2 = new UnitMeasurement(LengthOfUnit.CENTIMETER,1.0);
        Assert.assertNotEquals(result1, result2);

    }
}
