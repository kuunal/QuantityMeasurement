package com.quantitymeasurement;

import com.quantitymeasurement.models.Feet;
import com.quantitymeasurement.models.Inch;
import org.junit.Assert;
import org.junit.Test;

public class UnitsTest {

    @Test
    public void givenBothFoot_WhenToZero_ReturnsEqualToTrue(){
        Feet feet = new Feet(0.0);
        Feet anotherFeet = new Feet(0.0);
        Assert.assertEquals(feet.toInch(),anotherFeet.toInch());
    }

    @Test
    public void givenFoot_WhenNull_ReturnsFalse(){
        Feet feet = new Feet(0.0);
        Feet anotherFeet = null;
        Assert.assertFalse(feet.equals(anotherFeet));
    }

    @Test
    public void givenFeetObject_WhenSame_ReturnsTrue(){
        Feet feet = new Feet(0.0);
        Assert.assertTrue(feet.equals(feet));
    }
}
