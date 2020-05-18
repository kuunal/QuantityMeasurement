package com.quantitymeasurement;

public class QuantityMeasurement {

    public boolean checkEquals(Double length,Double otherLength){
        if(Double.compare(length,otherLength)   ==0)
            return true;
        return false;
    }

    public Double addLengths(Double ...inchLength){
        if(inchLength.length==0){
            return 0.0;
        }else if(inchLength.length==1){
            return inchLength[0];
        }else {
            Double total=0.0;
            for (Double element : inchLength) {
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
