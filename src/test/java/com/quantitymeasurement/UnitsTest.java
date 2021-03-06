package com.quantitymeasurement;

import com.quantitymeasurement.temperature.Celsuis;
import com.quantitymeasurement.temperature.Farenheit;
import com.quantitymeasurement.units.CM;
import com.quantitymeasurement.units.Feet;
import com.quantitymeasurement.units.Inch;
import com.quantitymeasurement.units.Yards;
import com.quantitymeasurement.volumes.Gallon;
import com.quantitymeasurement.volumes.Litres;
import com.quantitymeasurement.volumes.ML;
import com.quantitymeasurement.weights.Gram;
import com.quantitymeasurement.weights.KG;
import com.quantitymeasurement.weights.Tonne;
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

    @Test
    public void givenTwoInch_WhenCorrect_ReturnsSum(){
        Inch inch = new Inch(2.0);
        Inch anotherInch = new Inch(2.0);
        Assert.assertEquals(4.0,inch.addLengths(anotherInch.length,inch.length),0.0);
    }

    @Test
    public void givenFeetAndInch_WhenCorrect_ReturnsSum(){
        Inch inch = new Inch(2.0);
        Inch feet = new Feet(1.0).toInch();
        Assert.assertEquals(14.0,inch.addLengths(inch.length,feet.length),0.0);
    }

    @Test
    public void givenFeets_WhenCorrect_ReturnsSum(){
        Inch inch = new Feet(1.0).toInch();
        Inch anotherInch = new Feet(1.0).toInch();
        Assert.assertEquals(24.0,inch.addLengths(anotherInch.length,inch.length),0.0);
    }

    @Test
    public void givenInchAndCM_WhenCorrect_ReturnsSum(){
        Inch inch = new Inch(2.0);
        Inch anotherInch = new CM(2.5).toInch();
        Assert.assertEquals(3.0,inch.addLengths(anotherInch.length,inch.length),0.0);
    }

    @Test
    public void givenVolumeInGallonAndLitres_WhenEquals_ShouldReturnTrue(){
        ML gallon = new Gallon(1.0).toML();
        ML litres = new Litres(3.785).toML();
        Assert.assertTrue(gallon.checkEquals(litres));
    }

    @Test
    public void givenLitreAndML_WhenEqual_ReturnsTrue(){
        ML ml = new ML(1000.0);
        ML litre = new Litres(1.0).toML();
        Assert.assertTrue(ml.checkEquals(litre));
    }

    @Test
    public void givenGallonAndLitres_WhenAdded_ReturnsSum(){
        ML gallon =  new Gallon(1.0).toML();
        ML litres = new Litres(3.785).toML();
        Assert.assertEquals(7570.0,gallon.addLengths(gallon.length,litres.length),0);
    }

    @Test
    public void givenKGAndGram_WhenEquals_ReturnsTrue(){
        Gram kg = new KG(1.0).toGram();
        Gram gram = new Gram(1000.0);
        Assert.assertTrue(kg.checkEquals(gram));
    }

    @Test
    public void givenWeightInTonneAndKgs_WhenEqual_ReturnsTrue(){
        Gram tonne = new Tonne(1.0).toGram();
        Gram kg = new KG(1000.0).toGram();
        Assert.assertTrue(kg.checkEquals(tonne));
    }

    @Test
    public void givenWeight_InGramAndTonne_WhenAdded_ReturnsSum(){
        Gram tonne = new Tonne(1.0).toGram();
        Gram gram = new Gram( 1000.0);
        Double addedWeigths = gram.addLengths(gram.weight,tonne.weight);
        KG weigthInKGs = gram.FromGramToKG(addedWeigths);
        Assert.assertEquals(1001.0,weigthInKGs.weight,0);
    }


    @Test
    public void givenTemperature_InFarenheitAndCelsius_WhenEqual_ReturnsTrue(){
        Farenheit farenheit = new Farenheit(212.0);
        Farenheit celsius = new Celsuis(100.0);
        Assert.assertTrue(farenheit.equals(celsius));
    }

}
