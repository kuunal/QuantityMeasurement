package com.quantitymeasurement.weights;

public class KG extends Gram{

    public double weight;

    public KG(Double weight) {
        this.weight=weight;
    }


    @Override
    public Gram toGram() {
        return new Gram(this.weight*1000);
    }
}
