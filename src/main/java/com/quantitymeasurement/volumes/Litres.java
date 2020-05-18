package com.quantitymeasurement.volumes;

public class Litres extends ML {
    public double length;

    public Litres(Double length) {
        this.length=length;
    }

    public Litres() {
    }


    public ML toML() {
        return new ML(this.length*1000);
    }

}
