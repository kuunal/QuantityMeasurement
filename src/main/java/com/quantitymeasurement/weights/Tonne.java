package com.quantitymeasurement.weights;

public class Tonne extends Gram{

    public double weight;

    public Tonne(Double weight) {
        this.weight=weight;
    }

    @Override
    public Gram toGram() {
        return new Gram(this.weight*1000000);
    }
}
