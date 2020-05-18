package com.quantitymeasurement.volumes;

import com.quantitymeasurement.QuantityMeasurement;

public class ML extends QuantityMeasurement {
    public double length;

    public ML(Double length) {
        this.length=length;
    }

    public ML() {
    }


    public ML toML() {
        return new ML(this.length);
    }

    @Override
    public Double addLengths(Double... inchLength) {
        return super.addLengths(inchLength);
    }

    public final boolean checkEquals(ML otherObj) {
        return super.checkEquals(this.length, otherObj.length);
    }

}
