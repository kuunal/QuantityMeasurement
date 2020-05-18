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

    @Override
    protected final boolean checkEquals(Inch inch, Inch otherInch) {
        return super.checkEquals(inch, otherInch);
    }


}
