package com.quantitymeasurement.services;

public class Unit {

    public int YARD_TO_FEET = 3;
    public int YARD_TO_INCH = 36;

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

    public boolean unitConversion(Unit unit) {
        if (this.type.equals(Type.YARD) && unit.type.equals(Type.FEET)) {
            return Double.compare(this.value * YARD_TO_FEET, unit.value) == 0;
        }else if (this.type.equals(Type.YARD) && unit.type.equals(Type.INCH)) {
            return Double.compare(this.value * YARD_TO_INCH, unit.value) == 0;
        }return false;

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
