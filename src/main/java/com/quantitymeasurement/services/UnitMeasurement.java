package com.quantitymeasurement.services;
import com.quantitymeasurement.enums.Unit;
import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.utility.Utility;

import static com.quantitymeasurement.enums.Unit.CELSIUS;
import static com.quantitymeasurement.enums.Unit.FAHRENHEIT;

public class UnitMeasurement {
    Utility utility = new Utility();
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
        utility.compatibilityCheck(result2, result1);
        double result = result1.quantity + result2.quantity;
        return result;
    }
}