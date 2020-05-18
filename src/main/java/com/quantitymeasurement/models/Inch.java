package com.quantitymeasurement.models;

import com.quantitymeasurement.QuantityMeasurement;

public class Inch extends QuantityMeasurement{
    public double length;

    public Inch(Double length) {
        this.length=length;
    }

    public Inch() {
    }


    public Inch toInch() {
        return new Inch();
    }


    public final boolean checkEquals( Inch otherObj) {
        return super.checkEquals(this.length, otherObj.length);
    }

    public final Double addLengthsInInches(Double... inchLength) {
        return super.addLengthsInInches(inchLength);
    }
}
