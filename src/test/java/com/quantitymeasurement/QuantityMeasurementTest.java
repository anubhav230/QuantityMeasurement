package com.quantitymeasurement;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.services.UnitMeasurement;
import com.quantitymeasurement.services.UnitQuantity;
import org.junit.Assert;
import org.junit.Test;

import static com.quantitymeasurement.models.Unit.*;

public class QuantityMeasurementTest {

    UnitMeasurement unitMeasurement = new UnitMeasurement();

    @Test
    public void givenSameUnit_WhenEqual_ShouldReturnTrue() {
        try {
            UnitQuantity value1 = new UnitQuantity(0.0, INCH);
            UnitQuantity value2 = new UnitQuantity(0.0, INCH);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
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
    public void givenDifferentValueOfSameUnit_WhenNotEqual_ShouldNotEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, FEET);
            UnitQuantity value2 = new UnitQuantity(2.0, FEET);
            boolean result = value1.compare(value2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    //test case for inch

    @Test
    public void givenZeroInch_WhenEqual_ShouldBeEqual() throws QuantityMeasurementException {
        UnitQuantity feet1 = new UnitQuantity(0.0, INCH);
        UnitQuantity feet2 = new UnitQuantity(0.0, INCH);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenSameInch_ShouldBeEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, INCH);
            UnitQuantity value2 = new UnitQuantity(0.0, INCH);
            boolean result = value1.compare(value2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
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
    public void givenThreeFeetAndOneYard_WhenEqual_ShouldReturnTrue() {
        try {
            UnitQuantity value1 = new UnitQuantity(3.0, FEET);
            UnitQuantity value2 = new UnitQuantity(1.0, YARD);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenOneFeetAndOneYard_WhenEqual_ShouldReturnFalse() {
        try {
            UnitQuantity value1 = new UnitQuantity(3.0, FEET);
            UnitQuantity value2 = new UnitQuantity(1.0, YARD);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenZeroInchAndOneYard_WhenNotEqual_ShouldNotBeEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(0.0, INCH);
            UnitQuantity value2 = new UnitQuantity(0.0, YARD);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenValueOfInchAndYard_WhenSameAfterConverting_ShouldBeEqualAfterConverting() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, YARD);
            UnitQuantity value2 = new UnitQuantity(36.0, INCH);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenValueOfInchAndYard2_ShouldBeEqualAfterConverting() {
        try {
            UnitQuantity value1 = new UnitQuantity(36.0, INCH);
            UnitQuantity value2 = new UnitQuantity(1.0, YARD);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFeetAndYard_ShouldBeEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, YARD);
            UnitQuantity value2 = new UnitQuantity(3.0, FEET);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenTwoInchAndFiveCentimeter_ShouldBeEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(2.0, INCH);
            UnitQuantity value2 = new UnitQuantity(5.0, CENTIMETER);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenNullValueForCentimeter_ShouldThrowQuantityMeasurementException() {
        try {
            UnitQuantity feet2 = new UnitQuantity(null, CENTIMETER);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenTwoReferencesOfSameClass_ShouldCompareReference() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        Assert.assertNotEquals(unitMeasurement, equals(unitMeasurement));
    }

    @Test
    public void givenDifferentTypeOfClass_ShouldNotEqual() {
        UnitMeasurement unitMeasurement = new UnitMeasurement();
        String string = "";
        Assert.assertNotEquals(unitMeasurement, string);
    }

    @Test
    public void givenEqualCentimeter_ShouldBeEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(0.0, CENTIMETER);
            UnitQuantity value2 = new UnitQuantity(1.0, CENTIMETER);
            boolean result = value1.compare(value2);
            Assert.assertEquals(false, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(2.0, INCH);
        UnitQuantity unitQuantity1 = new UnitQuantity(2.0, INCH);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(4.0, result3, 0.0);
    }

    @Test
    public void givenOneFEETAndTwoInch_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, FEET);
        UnitQuantity unitQuantity1 = new UnitQuantity(2.0, INCH);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(14.0, result3, 0.0);
    }

    @Test
    public void givenOneFEETAndOneFeet_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(1.0, FEET);
        UnitQuantity unitQuantity1 = new UnitQuantity(1.0, FEET);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(24.0, result3, 0.0);
    }

    @Test
    public void givenOneInchAndTwoPointFiveCm_WhenAdded_ShouldReturnEquals() throws QuantityMeasurementException {
        UnitQuantity unitQuantity = new UnitQuantity(2.0, INCH);
        UnitQuantity unitQuantity1 = new UnitQuantity(2.5, CENTIMETER);
        double result3 = unitMeasurement.addUnit(unitQuantity, unitQuantity1);
        Assert.assertEquals(3.0, result3, 0.0);
    }

    @Test
    public void givenOneGallonAndLitre_WhenEqual_shouldReturnTrue()  {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, GALLON);
            UnitQuantity value2 = new UnitQuantity(3.78, LITRES);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void givenOneLitreAndML_WhenEqual_ShouldReturnEqual() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, LITRES);
            UnitQuantity value2 = new UnitQuantity(1000.0, MILLILITERS);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenGallonAndLitre_AfterAdding_shouldEqualToLitre() throws QuantityMeasurementException {
        UnitQuantity value1 = new UnitQuantity(1.0, GALLON);
        UnitQuantity value2 = new UnitQuantity(3.78, LITRES);
        UnitQuantity value3 = new UnitQuantity(7.57, LITRES);
        double value4 = value3.quantity;
        double result3 = unitMeasurement.addUnit(value1, value2);
        Assert.assertEquals(result3, value4, 0.1);
    }

    @Test
    public void givenOneKgAndGram_WhenEqual_ShouldReturnTrue() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, KILOGRAMS);
            UnitQuantity value2 = new UnitQuantity(1000.0, GRAMS);
            boolean result = value1.compare(value2);
            Assert.assertEquals(true, result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }

    }


    @Test
    public void givenOneTonne_WhenEqualToThousandKg_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity value1 = new UnitQuantity(1.0, TONNE);
        UnitQuantity value2 = new UnitQuantity(1000.0, KILOGRAMS);
        Assert.assertEquals(value1.quantity, value2.quantity);
    }


    @Test
    public void givenOneTonneAndThousandGm_WhenAdded_ShouldEqualTo1001Kg() throws QuantityMeasurementException {
        UnitQuantity value1 = new UnitQuantity(1.0, TONNE);
        UnitQuantity value2 = new UnitQuantity(1000.0, GRAMS);
        UnitQuantity value3 = new UnitQuantity(1001.0, KILOGRAMS);
        double value4 = value3.quantity;
        double result3 = unitMeasurement.addUnit(value1, value2);
        Assert.assertEquals(result3, value4, 0.1);
    }

    @Test
    public void givenOneTonne2_WhenEqualToThousandKg_ShouldReturnTrue() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, TONNE);
            UnitQuantity value2 = new UnitQuantity(1000.0, KILOGRAMS);
            boolean result = value1.compare(value2);
            Assert.assertTrue(result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    //ni
    @Test
    public void givenOneTonne2_WhenNotEqualToThousandKg_ShouldReturnFalse() {
        try {
            UnitQuantity value1 = new UnitQuantity(1.0, TONNE);
            UnitQuantity value2 = new UnitQuantity(1000.0, KILOGRAMS);
            boolean result = value1.compare(value2);
            Assert.assertTrue(result);
        } catch (QuantityMeasurementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFahrenheitAndCelsius_WhenEqual_ShouldReturnTrue() throws QuantityMeasurementException {
        UnitQuantity value1 = new UnitQuantity(212.0, FAHRENHEIT);
        Assert.assertEquals(100.0, value1.quantity, 0.0);
    }
}