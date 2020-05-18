package com.quantitymeasurement;

import com.quantitymeasurement.models.Inch;

public class QuantityMeasurement {

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj==this)
            return true;
        else
            return false;
    }


    protected boolean checkEquals(Inch inch, Inch otherInch){
        if(inch.length==otherInch.length)
            return true;
        return false;
    }

}
