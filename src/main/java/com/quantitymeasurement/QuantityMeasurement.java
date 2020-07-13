package com.quantitymeasurement;

public class QuantityMeasurement {

    /**
     * method for converting feet to inch
     * @param feet
     * @return
     */
    public double covertUnit(double feet) {
        int ONE_FEET_EQUALS_INCH = 12;
        double result = feet * ONE_FEET_EQUALS_INCH;
        return result;
    }
}
