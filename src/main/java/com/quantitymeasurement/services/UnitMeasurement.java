package com.quantitymeasurement.services;
import com.quantitymeasurement.enums.Unit;
import com.quantitymeasurement.exception.QuantityMeasurementException;

import static com.quantitymeasurement.enums.Unit.CELSIUS;
import static com.quantitymeasurement.enums.Unit.FAHRENHEIT;

public class UnitMeasurement {

    private static final int TEMPERATURE_CONSTANT = 32;

    public Double unitConversion(double value, Unit unit) {
        if (unit == FAHRENHEIT)
            return (value - TEMPERATURE_CONSTANT) * CELSIUS.value;
        else if (unit == CELSIUS)
            return (value * FAHRENHEIT.value) + TEMPERATURE_CONSTANT;
        else
        return value * unit.value;
    }

    public double addUnit(UnitQuantity result2, UnitQuantity result1) throws QuantityMeasurementException {
        if (result2.type != result1.type)
            throw new QuantityMeasurementException("Values are not compatible", QuantityMeasurementException
                    .ExceptionType.COMPATIBILITY_FAILURE);
        double result = result1.quantity + result2.quantity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}