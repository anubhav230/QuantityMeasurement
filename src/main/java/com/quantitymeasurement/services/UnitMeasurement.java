package com.quantitymeasurement.services;

import com.quantitymeasurement.exception.QuantityMeasurementException;

public class UnitMeasurement {

    public double unitConversion(LengthOfUnit unit, Double value) throws QuantityMeasurementException {
        if (value < 0)
            throw new QuantityMeasurementException("enter positive value", QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE);
        else {
            try {
                double result = value * unit.value;
                return result;
            } catch (NullPointerException e) {
                throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
            }
        }
    }

    public boolean compare(double value, double value2) {
        return Double.compare(value, value2) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null) return false;
        if (getClass() != o.getClass()) return false;
        return super.equals(o);
    }
}
