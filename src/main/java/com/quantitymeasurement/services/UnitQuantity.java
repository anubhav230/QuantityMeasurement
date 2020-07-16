package com.quantitymeasurement.services;

import com.quantitymeasurement.exception.QuantityMeasurementException;

import java.util.Objects;

public class UnitQuantity {
    public Double quantity;
    public Type type;


    UnitMeasurement unitMeasurement = new UnitMeasurement();

    public UnitQuantity(Double quantity, Unit unit) throws QuantityMeasurementException {
        try {
            this.quantity = unitMeasurement.unitConversion(quantity, unit);
            this.type = unit.type;
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException
                    .ExceptionType.NULL_VALUE);
        }

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitQuantity that = (UnitQuantity) o;
        return Objects.equals(quantity, that.quantity) &&
                type == that.type;
    }
}

