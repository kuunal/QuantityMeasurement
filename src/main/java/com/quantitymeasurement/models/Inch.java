package com.quantitymeasurement.models;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.Units;

public class Inch extends QuantityMeasurement{
    public double length;
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

    Inch(double length) {
        this.length=length;
    }

    public Inch() {
    }

    public Inch inchToOtherUnit() {
        return null;
    }

    public Inch toInch() {
        return new Inch();
    }

    public final boolean checkEquals(Inch otherInch){
        if(this.length==otherInch.length)
            return true;
        return false;
    }

}
