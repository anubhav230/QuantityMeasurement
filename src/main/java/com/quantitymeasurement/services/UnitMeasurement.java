package com.quantitymeasurement.services;

import com.quantitymeasurement.exception.QuantityMeasurementException;

import java.util.Objects;

public class UnitMeasurement {

    public UnitMeasurement() {
    }

    private Unit unit;
    private Double value;

//    public UnitMeasurement(Unit unit, Double value) {
//        this.value = value;
//        this.unit = unit;
//    }
//
//    public double unitConversion(Unit unit, Double value) throws QuantityMeasurementException {
//        try {
//            double result = value * unit.value;
//            return result;
//        } catch (NullPointerException e) {
//            throw new QuantityMeasurementException("Null value", QuantityMeasurementException
//                    .ExceptionType.NULL_VALUE);
//        }
//
//    }

    public boolean compare(double value, double value2) {
        return Double.compare(value, value2) == 0;
    }

    public double addUnit(UnitQuantity result2, UnitQuantity result1) {
        double result = result1.quantity+result2.quantity;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement that = (UnitMeasurement) o;
        return unit == that.unit &&
                Objects.equals(value, that.value);
    }



    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UnitMeasurement that = (UnitMeasurement) o;
//        return unit == that.unit &&
//                Objects.equals(value, that.value);
//    }


}