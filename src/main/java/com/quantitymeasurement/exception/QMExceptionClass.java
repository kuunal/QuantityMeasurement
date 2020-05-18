package com.quantitymeasurement.exception;

public class QMExceptionClass extends RuntimeException{
    public enum QMExceptions{NULL_UNIT_EXCEPTION};

    QMExceptions type;

    public QMExceptionClass(String message,QMExceptions type) {
        super(message);
        this.type=type;
    }
}
