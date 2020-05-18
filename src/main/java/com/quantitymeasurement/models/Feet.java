package com.quantitymeasurement.models;

public class Feet extends Inch{
    public double length;

    public Feet(Double length){
        this.length=length;
    }

    @Override
    public Feet inchToOtherUnit() {
        return new Feet(length/12);
    }

    @Override
    public Inch toInch() {
        return new Inch(length*12);
    }


}
