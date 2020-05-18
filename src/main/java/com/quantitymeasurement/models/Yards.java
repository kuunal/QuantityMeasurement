package com.quantitymeasurement.models;

public class Yards extends Inch{
    public double length;

    public Yards(Double length){
        this.length=length;
    }

    @Override
    public Yards inchToOtherUnit() {
        return new Yards(length/(12*3));
    }

    @Override
    public Inch toInch() {
        return new Inch(length*(12*3));
    }

}
