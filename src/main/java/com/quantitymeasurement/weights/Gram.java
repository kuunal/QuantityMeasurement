package com.quantitymeasurement.weights;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.volumes.ML;

public class Gram extends QuantityMeasurement {
    public double weight;

    public Gram(Double weight) {
        this.weight=weight;
    }

    public Gram() {
    }

    public KG FromGramToKG(Double weight){
        return new KG(weight/1000);
    }

    public Gram toGram() {
        return new Gram(this.weight);
    }

    public final boolean checkEquals(Gram otherObj) {
        return super.checkEquals(this.weight, otherObj.weight);
    }

    @Override
    public final Double addLengths(Double... weights) {
        return super.addLengths(weights);
    }
}
