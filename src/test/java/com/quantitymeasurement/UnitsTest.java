package com.quantitymeasurement;

import com.quantitymeasurement.models.Feet;
import com.quantitymeasurement.models.Inch;
import org.junit.Assert;
import org.junit.Test;

public class UnitsTest {

    @Test
    public void givenBothFoot_WhenToZero_ReturnsEqualToTrue(){
        Inch inch = new Feet(0.0).toInch();
        Inch anotherInch = new Feet(0.0).toInch();
        Assert.assertTrue(inch.checkEquals(anotherInch));
    }

    @Test
    public void givenFoot_WhenNull_ReturnsFalse(){
        Feet feet = new Feet(0.0);
        Feet anotherFeet = null;
        Assert.assertFalse(feet.equals(anotherFeet));
    }

    @Test
    public void givenFeetObject_WhenReferanceSame_ReturnsTrue(){
        Feet feet = new Feet(0.0);
        Assert.assertTrue(feet.equals(feet));
    }

    @Test
    public void givenFeetObject_WhenTypeSame_ReturnsTrue(){
        Feet feet = new Feet(0.0);
        Feet anotherFeet = new Feet(0.0);
        Assert.assertTrue(feet.equals(anotherFeet));
    }

    @Test
    public void givenFeetObject_WithSameValues_ReturnsTrue(){
        Inch inch = new Feet(2.0).toInch();
        Inch anotherInch = new Feet(2.0).toInch();
        Assert.assertTrue(inch.checkEquals(anotherInch));
    }

    @Test
    public void givenInchObject_WhenNull_ReturnsFalse(){
        Inch inch = new Inch(0.0);
        Inch anotherInch = new Inch(0.0);
        Assert.assertTrue(inch.checkEquals(anotherInch));
    }

    @Test
    public void givenInchObject_WhenReferanceSame_ReturnsTrue(){
        Inch inch = new Inch(0.0);
        Assert.assertTrue(inch.equals(inch));
    }


    @Test
    public void givenInchObject_WhenTypeSame_ReturnsTrue(){
        Inch inch = new Inch(0.0);
        Inch anotherInch = new Inch(0.0);
        Assert.assertTrue(inch.equals(anotherInch));
    }


    @Test
    public void givenInchObject_WithSameValues_ReturnsTrue(){
        Inch inch = new Inch(2.0);
        Inch anotherInch = new Inch(2.0);
        Assert.assertTrue(inch.checkEquals(anotherInch));
    }

    @Test
    public void givenInchAndFeetObject_WhenZero_ReturnsEqualToTrue(){
        Inch inch = new Inch(0.0);
        Inch feet = new Feet(0.0).toInch();
        Assert.assertTrue(inch.checkEquals(feet));
    }



}
