/**
File name: MyHealthDataTest2.java
@author Liu Siqian, 041103621
Course: CST8284
Assignment: Assign01
Date: Feb 18, 2024
Professor: Zeinab Bayati
Purpose: A JUnit test program under class MyHealthData
*/
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * the expected value is calculated by formula: weight / ( height * height)
 */
public class MyHealthDataTest2 {
	
	private static final double EPSILON = 1E-12;

	@Test
	public void testGetBMI() {
	    MyHealthData health1 = new MyHealthData("Siqian", "Liu", "female", 1.6, 60, 1988, 2024);
	    double bmiResult = health1.getBMI();
	    double expected = 23.4375;
	    Assert.assertEquals(expected, bmiResult, EPSILON);
	}

}
