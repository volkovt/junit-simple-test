package entities.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTest {
	
	@Test
	public void constructorShouldPassWhenValidInformation() {
		Assertions.assertDoesNotThrow(() -> {
			new Financing(100000.0, 2000.0, 80);
		});
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentWhenInValidInformation() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Financing(100000.0, 2000.0, 20));
	}
	
	@Test
	public void totalAmountShouldChangeWhenValidValue() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Double expectedValue = 80000.0;
		Assertions.assertDoesNotThrow(() -> {
			f.setTotalAmount(expectedValue);
		}); 
		
		Assertions.assertEquals(f.getTotalAmount(), expectedValue);
	}
	
	@Test
	public void totalAmountShouldThrowIllegalArgumentWhenInvalidValue() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setTotalAmount(200000.0);
		}); 
	}
	
	@Test
	public void incomeShouldChangeWhenValidValue() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertDoesNotThrow(() -> {
			f.setIncome(3000.0);
		}); 
		
		Assertions.assertEquals(f.getIncome(), 3000.0);
	}
	
	@Test
	public void incomeShouldThrowIllegalArgumentWhenInvalidValue() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setIncome(900.0);
		});
	}
	
	@Test
	public void monthShouldPassWhenValidValue() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Integer expectedValue = 90;
		Assertions.assertDoesNotThrow(() -> {
			f.setMonths(expectedValue);
		});
		
		Assertions.assertEquals(f.getMonths(), expectedValue);
	}
	
	@Test
	public void monthShouldThrowIllegalArgumentWhenInvalidValue() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			f.setMonths(20);
		});
	}
	
	@Test
	public void entryShouldCalculateCorrect() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Double expectedValue = 20000.0;
		
		Assertions.assertEquals(f.entry(), expectedValue);
	}
	
	@Test
	public void quotaShouldCalculateCorrect() {
		Financing f = new Financing(100000.0, 2000.0, 80);
		Double expectedValue = 1000.0;
		
		Assertions.assertEquals(f.quota(), expectedValue);
	}
}
