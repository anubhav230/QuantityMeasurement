package com.quantitymeasurement.utility;

import com.quantitymeasurement.exception.QuantityMeasurementException;
import com.quantitymeasurement.services.UnitQuantity;

public class Utility {
    public void compatibilityCheck(UnitQuantity value1, UnitQuantity value2) throws QuantityMeasurementException {
        if (value1.type != value2.type)
            throw new QuantityMeasurementException("Values are not compatible", QuantityMeasurementException
                    .ExceptionType.COMPATIBILITY_FAILURE);
    }
}