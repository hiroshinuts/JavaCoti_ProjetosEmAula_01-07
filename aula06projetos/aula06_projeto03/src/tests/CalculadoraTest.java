package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora c = new Calculadora(10, 5);
		assertEquals(new Integer(15), c.somar());
	}

	@Test
	public void testSubtrair() {
		Calculadora c = new Calculadora(10, 5);
		assertEquals(new Integer(5), c.subtrair());
	}

	@Test
	public void testMultiplicar() {
		Calculadora c = new Calculadora(10, 5);
		assertEquals(new Integer(50), c.multiplicar());
	}

	@Test
	public void testDividir() {
		Calculadora c = new Calculadora(10, 5);
		
		try {			
			assertEquals(new Integer(2), c.dividir());
			
		} catch (Exception e) {
			fail("Teste Falhou: " + e.getMessage());
		}
	}
	
	@Test(expected = Exception.class)
	public void testDividirPorZero() throws Exception{
		
		Calculadora c = new Calculadora(10, 0);
		c.dividir();
	}

}












