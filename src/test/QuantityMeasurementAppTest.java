package test;

import main.java.QuantityMeasurementApp;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementAppTest {


    @Test
    public void testFeetEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.compareFeet(1.0, 1.0),
                "1.0 ft should equal 1.0 ft");
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.compareFeet(1.0, 2.0),
                "1.0 ft should not equal 2.0 ft");
    }

    @Test
    public void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f), "Feet object should equal itself");
    }

    @Test
    public void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals(null), "Feet should not equal null");
    }

    @Test
    public void testFeetEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals("test"), "Feet should not equal non-numeric input");
    }


    @Test
    public void testInchesEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.compareInches(1.0, 1.0),
                "1.0 inch should equal 1.0 inch");
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.compareInches(1.0, 2.0),
                "1.0 inch should not equal 2.0 inch");
    }

    @Test
    public void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(i.equals(i), "Inches object should equal itself");
    }

    @Test
    public void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals(null), "Inches should not equal null");
    }

    @Test
    public void testInchesEquality_NonNumericInput() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals("abc"), "Inches should not equal non-numeric input");
    }
}