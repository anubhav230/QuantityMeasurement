package com.quantitymeasurement.services;

public class Unit {

    public enum Type {
        FEET,INCH
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
