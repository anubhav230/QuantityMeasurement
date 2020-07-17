package com.quantitymeasurement.services;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.utility.Utility;

public class AddUnit {
    Utility utility = new Utility();
    public double addUnit(UnitQuantity result2, UnitQuantity result1) throws QuantityMeasurementException {
        utility.compatibilityCheck(result2, result1);
        double result = result1.quantity + result2.quantity;
        return result;
    }
}