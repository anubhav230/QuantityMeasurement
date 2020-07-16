package com.quantitymeasurement.services;

import static com.quantitymeasurement.services.Type.*;

public enum Unit {

    FEET(12.0, LENGTH), INCH(1.0, LENGTH),
    YARD(36.0, LENGTH), CENTIMETER(1/2.5, LENGTH),

    GALLON(3.78, VOLUME), LITRES(1.0, VOLUME),
    MILLILITERS(0.001, VOLUME),

    KILOGRAMS(1.0, WEIGHT), GRAMS(0.001, WEIGHT),
    TONNE(1000.0, WEIGHT);

    public Type type;
    public Double value;

    Unit(Double value, Type type) {
        this.value = value;
        this.type = type;
    }
}

