package com.quantitymeasurement.volumes;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.units.Inch;

public class Gallon extends ML {

    public double length;

    public Gallon(Double length) {
        this.length=length;
    }

    public Gallon() {
    }


    public ML toML() {
        return new ML(this.length*3785);
    }




}
