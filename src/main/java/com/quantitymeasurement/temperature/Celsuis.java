package com.quantitymeasurement.temperature;

public class Celsuis extends Farenheit{
    double temperature ;

    public Celsuis(Double temperature){
        this.temperature=temperature;
    }

    @Override
    public Farenheit toFarenheit() {
        return new Farenheit((this.temperature-32)*5/9);
    }

}
