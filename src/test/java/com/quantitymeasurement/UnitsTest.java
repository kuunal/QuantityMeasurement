package com.quantitymeasurement;

import com.quantitymeasurement.models.Feet;
import com.quantitymeasurement.models.Inch;
import org.junit.Assert;
import org.junit.Test;

public class UnitsTest {

    @Test
    public void givenBothFoot_WhenToZero_ReturnsEqualToTrue(){
        Feet feet = new Feet(0);
        Feet anotherFeet = new Feet(0);
        Assert.assertEquals(feet.toInch(),anotherFeet.toInch());
    }

}