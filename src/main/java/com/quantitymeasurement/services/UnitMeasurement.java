package com.quantitymeasurement.services;

import com.quantitymeasurement.exception.QuantityMeasurementException;

import java.util.Objects;

public class UnitMeasurement {

    public UnitMeasurement() {

    }

    LengthOfUnit unit;
    Double value;
    public UnitMeasurement(LengthOfUnit unit, Double value) {
        this.value = value;
        this.unit = unit;
    }

    public double unitConversion(LengthOfUnit unit, Double value) throws QuantityMeasurementException {
        try {
            double result = value * unit.value;
            return result;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }

    }

    public boolean compare(double value, double value2) {
        return Double.compare(value, value2) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement that = (UnitMeasurement) o;
        return unit == that.unit &&
                Objects.equals(value, that.value);
    }


}
