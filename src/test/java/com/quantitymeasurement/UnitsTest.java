package com.quantitymeasurement;

import com.quantitymeasurement.models.CM;
import com.quantitymeasurement.models.Feet;
import com.quantitymeasurement.models.Inch;
import com.quantitymeasurement.models.Yards;
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

    @Test
    public void givenInchAndFeetObject_WhenLengthOne_ReturnsEqualToFalse(){
        Inch inch = new Inch(1.0);
        Inch feet = new Feet(1.0).toInch();
        Assert.assertFalse(inch.checkEquals(feet));
    }

    @Test
    public void givenInchToTwelveAndFeetToOne_WhenEquals_ReturnsToTrue(){
        Inch inch = new Inch(12.0);
        Inch feet = new Feet(1.0).toInch();
        Assert.assertTrue(inch.checkEquals(feet));
    }

    @Test
    public void givenFeetToOneAndInchToTwelve_WhenEquals_ReturnsToTrue(){
        Inch inch = new Inch(12.0);
        Inch feet = new Feet(1.0).toInch();
        Assert.assertTrue(feet.checkEquals(inch));
    }


    @Test
    public void givenThreeFeetAndOneYard_WhenEquals_ReturnsTrue() {
        Inch yards = new Yards(1.0).toInch();
        Inch feet = new Feet(3.0).toInch();
        Assert.assertTrue(feet.checkEquals(yards));

    }

    @Test
    public void givenOneAndOneYard_WhenEquals_ReturnsFalse() {
        Inch yards = new Yards(1.0).toInch();
        Inch feet = new Feet(1.0).toInch();
        Assert.assertFalse(feet.checkEquals(yards));

    }

    @Test
    public void givenOneInchAndOneYard_WhenEquals_ReturnsFalse() {
        Inch yards = new Yards(1.0).toInch();
        Inch feet = new Inch(1.0);
        Assert.assertFalse(feet.checkEquals(yards));

    }


    @Test
    public void givenOneYardAndThirtySixInch_WhenEquals_ReturnsTrue() {
        Inch yards = new Yards(1.0).toInch();
        Inch feet = new Inch(36.0);
        Assert.assertTrue(feet.checkEquals(yards));
    }


    @Test
    public void givenOneYardAndThreeFeet_WhenEquals_ReturnsTrue() {
        Inch yards = new Yards(1.0).toInch();
        Inch feet = new Feet(3.0).toInch();
        Assert.assertTrue(feet.checkEquals(yards));
    }

    @Test
    public void givenTwoInchAndFiveCM_WhenEquals_ReturnsTrue(){
        Inch inch = new Inch(2.0);
        Inch cm = new CM(5.0).toInch();
        Assert.assertTrue(inch.checkEquals(cm));
    }

}
