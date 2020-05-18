package com.quantitymeasurement.models;

public class Feet extends Inch{
    public double length;

    public Feet(Double length){
        this.length=length;
    }


    @Override
    public Inch toInch() {
        return new Inch(length*12);
    }


}
