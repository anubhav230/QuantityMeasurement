package com.quantitymeasurement.services;

public enum LengthOfUnit {

    FEET(12.0,"Length") , INCH(1.0, "Length"), YARD(36.0, "Length"), CENTIMETER(1/2.5, "Length");

    public Double value;
    public String type;
    LengthOfUnit(Double value ,String type) {
        this.type = type;
        this.value = value;
    }
}
