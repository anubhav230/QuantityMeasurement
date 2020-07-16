package com.quantitymeasurement.services;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.models.Type;
import com.quantitymeasurement.models.Unit;

import java.util.Objects;

public class UnitQuantity  {
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

    public boolean compare(UnitQuantity value2) throws QuantityMeasurementException {
        if (this.type != value2.type)
            throw new QuantityMeasurementException("Values are not compatible", QuantityMeasurementException
                    .ExceptionType.COMPATIBILITY_FAILURE);
        return Double.compare(this.quantity, value2.quantity) == 0;
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

