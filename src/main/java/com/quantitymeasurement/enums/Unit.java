package com.quantitymeasurement.enums;

import static com.quantitymeasurement.enums.Type.*;

public enum Unit {
    
    FEET(12.0, LENGTH), INCH(1.0, LENGTH),
    YARD(36.0, LENGTH), CENTIMETER(1 / 2.5, LENGTH),

    GALLON(3.78, VOLUME), LITRES(1.0, VOLUME),
    MILLILITERS(0.001, VOLUME),

    KILOGRAMS(1.0, WEIGHT), GRAMS(0.001, WEIGHT),
    TONNE(1000.0, WEIGHT),

    CELSIUS(5.0/9.0,TEMPERATURE),
    FAHRENHEIT(9.0/5.0,TEMPERATURE);

    public Type type;
    public Double value;

    Unit(Double value, Type type) {
        this.value = value;
        this.type = type;
    }

    private static final int TEMPERATURE_CONSTANT = 32;
    public Double unitConversion(double value, Unit unit) {
        switch (unit) {
            case FAHRENHEIT:
                return (value - TEMPERATURE_CONSTANT) * CELSIUS.value;
            case CELSIUS:
                return (value * FAHRENHEIT.value) + TEMPERATURE_CONSTANT;
            default:
                return value * unit.value;
        }
    }
}

