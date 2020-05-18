package com.quantitymeasurement;

import com.quantitymeasurement.models.Inch;

public class QuantityMeasurement {

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass()!=o.getClass())
            return false;
        return true;
    }


    protected boolean checkEquals(Inch inch, Inch otherInch){
        if(inch.length==otherInch.length)
            return true;
        return false;
    }

}
