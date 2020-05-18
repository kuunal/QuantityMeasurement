package com.quantitymeasurement.temperature;

import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.weights.Gram;

public class Farenheit extends QuantityMeasurement {
    double temperature ;

    public Farenheit(Double temperature){
        this.temperature=temperature;
    }

    public Farenheit() {
    }

    public Farenheit toFarenheit(){
        return new Farenheit(this.temperature);
    }

    public boolean checkEquals(Farenheit farenheit) {
        return super.checkEquals(this.temperature, farenheit.temperature);
    }
}
