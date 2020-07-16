package com.quantitymeasurement.services;
import com.quantitymeasurement.models.Unit;

import static com.quantitymeasurement.models.Unit.CELSIUS;
import static com.quantitymeasurement.models.Unit.FAHRENHEIT;

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

    public double addUnit(UnitQuantity result2, UnitQuantity result1) {
        double result = result1.quantity + result2.quantity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //
//    public double convertTemperature(double value) {
//        double convertedValue = (value - 32.0) * (5d / 9d);
//        return convertedValue;
//    }
}