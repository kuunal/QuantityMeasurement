package com.quantitymeasurement.units;

public class CM extends Inch{
    public double length;

    public CM(Double length){
        this.length=length;
    }

    @Override
    public Inch toInch() {
        return new Inch(length/2.5);
    }

}
