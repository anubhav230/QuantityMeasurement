package com.quantitymeasurement.services;

public enum Unit {

    FEET(12.0,Type.LENGTH), INCH(1.0,Type.LENGTH),
    YARD(36.0,Type.LENGTH), CENTIMETER(1/2.5,Type.LENGTH),
    GALLON(3.78, Type.VOLUME), LITRES(1.0, Type.VOLUME),
    MILLILITERS(0.001, Type.VOLUME);

    public Type type;
    public Double value;

    Unit(Double value, Type type) {
        this.value = value;
        this.type = type;
    }

    public Double unitConversion( double value ,Unit unit) {
        double result = value * unit.value;
        return result;
    }
}