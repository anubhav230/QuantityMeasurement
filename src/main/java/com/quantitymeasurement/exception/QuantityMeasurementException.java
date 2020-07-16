package com.quantitymeasurement.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        NULL_VALUE,COMPATIBILITY_FAILURE
    }
    public ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
