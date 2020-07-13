package com.quantitymeasurement.services;

public class Unit {

    public enum Type {
        FEET, INCH, YARD
    }

    public double covertUnit(double feet) {
        int ONE_FEET_EQUALS_INCH = 12;
        double result = feet * ONE_FEET_EQUALS_INCH;
        return result;
    }

    double value;
    Type type;

    public Unit(Type type, Double value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.value, value) == 0 &&
                type == unit.type;
    }
}
