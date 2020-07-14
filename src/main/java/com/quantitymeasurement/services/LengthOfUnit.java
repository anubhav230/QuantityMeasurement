package com.quantitymeasurement.services;

public enum LengthOfUnit {

    FEET(12.0) , INCH(1.0), YARD(36.0), CENTIMETER(1/2.5);

    public Double value;
    LengthOfUnit(Double value) {
        this.value = value;
    }
}
