package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class calculadoraTest {
	private static double tol = 0.05;
	private CalculadoraCCC calcCCC;
	private CalculadoraCFC calcCFC;
	
	@BeforeEach
	public void setUp() {
		calcCCC = new CalculadoraCCC();
		calcCFC = new CalculadoraCFC();
	}
	
	@Test
	public void testNiobio() {
		assertEquals(8.57, calcCCC.calcula(92.91, 0.143), tol);
	}
	
	@Test
	public void testTungstenio() {
		assertEquals(19.28, calcCCC.calcula(183.84, 0.137), tol);
	}

	@Test
	public void testLitio() {
		assertEquals(0.53, calcCCC.calcula(6.94, 0.152), tol);
	}
	
	@Test
	public void testCobre() {
		assertEquals(8.89, calcCFC.calcula(63.55, 0.128), tol);
	}
	
	@Test
	public void testOuro() {
		assertEquals(19.36, calcCFC.calcula(196.97, 0.144), tol);
	}
	
	@Test
	public void testPrata() {
		assertEquals(10.60, calcCFC.calcula(107.87, 0.144), tol);
	}
}
