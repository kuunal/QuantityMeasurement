package com.quantitymeasurement;

public class QuantityMeasurement {

    public boolean checkEquals(Double length,Double otherLength){
        if(Double.compare(length,otherLength)==0)
            return true;
        return false;
    }

    public Double addLengths(Double ...Lengths){
        if(Lengths.length==0){
            return 0.0;
        }else if(Lengths.length==1){
            return Lengths[0];
        }else {
            Double total=0.0;
            for (Double element : Lengths) {
                total+=element;
            }
            return total;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj==this)
            return true;
        if(obj.getClass()==obj.getClass())
            return true;
        return false;
    }



}
