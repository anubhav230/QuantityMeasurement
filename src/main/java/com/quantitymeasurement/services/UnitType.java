package com.quantitymeasurement.services;

public enum UnitType {
    FEET(12),INCH(1);

    double value;
    UnitType(double value) {
        this.value = value;
    }
}
