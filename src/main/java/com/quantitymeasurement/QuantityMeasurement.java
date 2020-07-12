package com.quantitymeasurement;

public class QuantityMeasurement {

    public double covertUnit(double feet) {
        int ONE_FEET_EQUAL_INCH = 12;
        double result = feet * ONE_FEET_EQUAL_INCH;
        return result;
    }
}
