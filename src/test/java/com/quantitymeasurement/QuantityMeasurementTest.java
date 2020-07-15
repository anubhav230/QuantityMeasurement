package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.services.UnitMeasurement;
import com.quantitymeasurement.services.UnitQuantity;
import org.junit.Assert;
import org.junit.Test;

import static com.quantitymeasurement.services.Unit.*;

public class QuantityMeasurementTest {

    @Test
    public void givenSameUnit_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(1.0, FEET);
        UnitQuantity feet2 = new UnitQuantity(12.0, INCH);
        Assert.assertEquals(feet1, feet2);
    }


    @Test
    public void givenNullValue_ShouldThrowException() {
        try {
            UnitQuantity feet2 = new UnitQuantity(null, FEET);
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
        UnitMeasurement type1 = new UnitMeasurement();
        Double type2 = 0.0;
        Assert.assertNotEquals(type1, type2);
    }

    @Test
    public void givenDifferentValueOfSameUnit_WhenNotEqual_ShouldNotEqual() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(1.0, FEET);
        UnitQuantity feet2 = new UnitQuantity(2.0, FEET);
        Assert.assertNotEquals(feet1, feet2);
    }

    //test case for inch

    @Test
    public void givenZeroInch_WhenEqual_ShouldBeEqual() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(0.0, INCH);
        UnitQuantity feet2 = new UnitQuantity(0.0, INCH);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameInch_ShouldBeEqual() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(1.0, INCH);
        UnitQuantity feet2 = new UnitQuantity(0.0, INCH);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullValue_ShouldThrowQuantityMeasurementException() {
        try {
            UnitQuantity feet2 = new UnitQuantity(null, INCH);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
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
        UnitQuantity feet1 = new UnitQuantity(3.0, FEET);
        UnitQuantity feet2 = new UnitQuantity(1.0, YARD);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenEqual_ShouldReturnFalse() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(3.0, FEET);
        UnitQuantity feet2 = new UnitQuantity(1.0, YARD);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroInchAndOneYard_WhenNotEqual_ShouldNotBeEqual() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(0.0, INCH);
        UnitQuantity feet2 = new UnitQuantity(0.0, YARD);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenValueOfInchAndYard_WhenSameAfterConverting_ShouldBeEqualAfterConverting() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(1.0, YARD);
        UnitQuantity feet2 = new UnitQuantity(36.0, INCH);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenValueOfInchAndYard2_ShouldBeEqualAfterConverting() throws QuantityMeasurementException {

        UnitQuantity feet1 = new UnitQuantity(36.0, INCH);
        UnitQuantity feet2 = new UnitQuantity(1.0, YARD);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenFeetAndYard_ShouldBeEqual() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(1.0, YARD);
        UnitQuantity feet2 = new UnitQuantity(3.0, FEET);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenTwoInchAndFiveCentimeter_ShouldBeEqual() throws QuantityMeasurementException {

        UnitQuantity feet1 = new UnitQuantity(2.0, INCH);
        UnitQuantity feet2 = new UnitQuantity(5.0, CENTIMETER);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenNullValueForCentimeter_ShouldThrowQuantityMeasurementException() {
        try {
            UnitQuantity feet2 = new UnitQuantity(null, CENTIMETER);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }
//
//    @Test
//    public void givenTwoReferencesOfSameClass_ShouldCompareReference() {
//        UnitMeasurement unitMeasurement = new UnitMeasurement();
//        UnitMeasurement unitMeasurement2 = new UnitMeasurement();
//        Assert.assertNotEquals(unitMeasurement,equals(unitMeasurement2));
//    }

    @Test
    public void givenDifferentTypeOfClass_ShouldNotEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        String string = "";
        Assert.assertNotEquals(unitMeasurement, string);
    }

    @Test
    public void givenEqualCentimeter_ShouldBeEqual() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(0.0, CENTIMETER);
        UnitQuantity unitQuantity1 = new UnitQuantity(1.0, CENTIMETER);
        Assert.assertNotEquals(unitQuantity, unitQuantity1);

    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        UnitQuantity unitQuantity = new UnitQuantity(2.0, INCH);
        UnitQuantity unitQuantity1 = new UnitQuantity(2.0, INCH);


        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(4.0, result3, 0.0);
    }

    @Test
    public void givenOneFEETAndTwoInch_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();

        UnitQuantity unitQuantity = new UnitQuantity(1.0, FEET);
        UnitQuantity unitQuantity1 = new UnitQuantity(2.0, INCH);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(14.0, result3, 0.0);
    }

    @Test
    public void givenOneFEETAndOneFeet_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();

        UnitQuantity unitQuantity = new UnitQuantity(1.0, FEET);
        UnitQuantity unitQuantity1 = new UnitQuantity(1.0, FEET);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(24.0, result3, 0.0);
    }

    @Test
    public void givenOneInchAndTwoPointFiveCm_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitMeasurement unitMeasurement = new UnitMeasurement();


        UnitQuantity unitQuantity = new UnitQuantity(2.0, INCH);
        UnitQuantity unitQuantity1 = new UnitQuantity(2.5, CENTIMETER);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(3.0, result3, 0.0);
    }

    @Test
    public void givenOneGallonAndLitre_WhenEqual_shouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, GALLON);
        UnitQuantity unitQuantity1 = new UnitQuantity(3.78, LITRES);
        Assert.assertEquals(unitQuantity, unitQuantity1);
    }

}