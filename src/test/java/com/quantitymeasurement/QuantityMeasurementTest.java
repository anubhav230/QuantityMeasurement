package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.services.Unit;
import com.quantitymeasurement.services.UnitMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenSameUnit_WhenEqual_ShouldReturnTrue() {
       UnitMeasurement unitMeasurement = new UnitMeasurement(Unit.FEET,0.0);
        UnitMeasurement unitMeasurement2 = new UnitMeasurement(Unit.FEET,0.0);
        Assert.assertEquals(unitMeasurement,unitMeasurement2);
    }

    @Test
    public void givenNullValue_ShouldThrowException(){
        try {
            UnitMeasurement unitMeasurement = new UnitMeasurement();
            unitMeasurement.unitConversion(Unit.FEET,null);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenDifferentReferences_WhenNotEqual_ShouldCompareReference() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        UnitMeasurement unitMeasurement2 = new UnitMeasurement();
        Assert.assertNotEquals(unitMeasurement, equals(unitMeasurement2));
    }


    @Test
    public void givenSameType_WhenSameType_ShouldNotEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        UnitMeasurement unitMeasurement1 = new UnitMeasurement();
        Assert.assertEquals(unitMeasurement.getClass(), unitMeasurement1.getClass());
    }

    @Test
    public void givenDifferentValueOfSameUnit_WhenNotEqual_ShouldNotEqual() {
        UnitMeasurement result1 = new UnitMeasurement(Unit.FEET,0.0);
        UnitMeasurement result2 = new UnitMeasurement(Unit.FEET,1.0);
        Assert.assertNotEquals(result1, result2);
    }

    //test case for inch

    @Test
    public void givenZeroInch_WhenEqual_ShouldBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(Unit.INCH,0.0);
        UnitMeasurement result2 = new UnitMeasurement(Unit.INCH,0.0);
        Assert.assertEquals(result1, result2);
    }

    @Test
    public void givenSameInch_ShouldBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(Unit.INCH,0.0);
        UnitMeasurement result2 = new UnitMeasurement(Unit.INCH,1.0);
        Assert.assertNotEquals(result1, result2);
    }

    @Test
    public void givenNullValue_ShouldThrowQuantityMeasurementException() {
        try {
            UnitMeasurement unitMeasurement = new UnitMeasurement();
            unitMeasurement.unitConversion(Unit.INCH,null);
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
    public void givenThreeFeetAndOneYard_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result2 = unitMeasurement.unitConversion(Unit.FEET,3.0);
        double result = unitMeasurement.unitConversion(Unit.YARD,1.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(Unit.FEET,1.0);
        double result2 = unitMeasurement.unitConversion(Unit.YARD,1.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void givenZeroInchAndOneYard_WhenNotEqual_ShouldNotBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(Unit.INCH,0.0);
        UnitMeasurement result2 = new UnitMeasurement(Unit.YARD,1.0);
        Assert.assertNotEquals(result1, result2);
    }

    @Test
    public void givenValueOfInchAndYard_WhenSameAfterConverting_ShouldBeEqualAfterConverting() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(Unit.YARD,1.0);
        double result2 = unitMeasurement.unitConversion(Unit.INCH,36.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenValueOfInchAndYard2_ShouldBeEqualAfterConverting() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(Unit.INCH,36.0);
        double result2 = unitMeasurement.unitConversion(Unit.YARD,1.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenFeetAndYard_ShouldBeEqual() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(Unit.YARD,1.0);
        double result2 = unitMeasurement.unitConversion(Unit.FEET,3.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenTwoInchAndFiveCentimeter_ShouldBeEqual() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result = unitMeasurement.unitConversion(Unit.INCH,2.0);
        double result2 = unitMeasurement.unitConversion(Unit.CENTIMETER,5.0);
        boolean result3 = unitMeasurement.compare(result, result2);
        Assert.assertTrue(result3);
    }

    @Test
    public void givenNullValueForCentimeter_ShouldThrowQuantityMeasurementException() {
        try {
            UnitMeasurement unitMeasurement = new UnitMeasurement();
            unitMeasurement.unitConversion(Unit.CENTIMETER,null);
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
        Assert.assertNotEquals(unitMeasurement,string);
    }

    @Test
    public void givenEqualCentimeter_ShouldBeEqual() {
        UnitMeasurement result1 = new UnitMeasurement(Unit.CENTIMETER,0.0);
        UnitMeasurement result2 = new UnitMeasurement(Unit.CENTIMETER,1.0);
        Assert.assertNotEquals(result1, result2);

    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result2 = unitMeasurement.unitConversion(Unit.INCH,2.0);
        double result1 = unitMeasurement.unitConversion(Unit.INCH,2.0);
        double result3 = unitMeasurement.addUnit(result2, result1);
        Assert.assertEquals(4.0,result3,0.0);
    }

    @Test
    public void givenOneFEETAndTwoInch_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result2 = unitMeasurement.unitConversion(Unit.FEET,1.0);
        double result1 = unitMeasurement.unitConversion(Unit.INCH,2.0);
        double result3 = unitMeasurement.addUnit(result2, result1);
        Assert.assertEquals(14.0,result3,0.0);
    }

    @Test
    public void givenOneFEETAndOneFeet_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result2 = unitMeasurement.unitConversion(Unit.FEET,1.0);
        double result1 = unitMeasurement.unitConversion(Unit.FEET,1.0);
        double result3 = unitMeasurement.addUnit(result2, result1);
        Assert.assertEquals(24.0,result3,0.0);
    }

    @Test
    public void givenOneInchAndTwoPointFiveCm_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        double result2 = unitMeasurement.unitConversion(Unit.INCH,2.0);
        double result1 = unitMeasurement.unitConversion(Unit.CENTIMETER,2.5);
        double result3 = unitMeasurement.addUnit(result2, result1);
        Assert.assertEquals(3.0,result3,0.0);
    }
}
