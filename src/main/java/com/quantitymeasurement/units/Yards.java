package com.quantitymeasurement.units;

public class Yards extends Inch{
    public double length;

    public Yards(Double length){
        this.length=length;
    }

    @Override
    public Inch toInch() {
        return new Inch(length*(12*3));
    }

}
