package com.quantitymeasurement.services;

public class UnitMeasurement {

    public Double unitConversion(double value, Unit unit) {
        double result = value * unit.value;
        return result;
    }

    public double addUnit(UnitQuantity result2, UnitQuantity result1) {
        double result = result1.quantity + result2.quantity;
        return result;
    }

    public double convertTemperature(double value) {
        double convertedValue = (value - 32.0) * (5d / 9d);
        return convertedValue;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}