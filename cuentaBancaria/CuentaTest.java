package cuentaBancaria;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CuentaTest {
	public Cuenta cuenta;
	
	@Before
	public void crearCuenta() {
	cuenta = new Cuenta("P3p4rt", 1000);
	 }
	
	@After
	public void eliminaCuenta() {
	cuenta.setSaldo(0);
	}
	
	@Test
	public void testGetSaldo() {
		assertEquals(1000, cuenta.getSaldo(),0.01);
	}

	@Test
	public void testSetSaldo() {
		cuenta.setSaldo(1000);
		assertEquals(1000, cuenta.getSaldo(),0.01);
	}

	@Test
	public void testIngresarDinero() {
		cuenta.ingresarDinero(100);
		assertEquals(1100, cuenta.getSaldo(),0.01);
	}

	@Test
	public void testExtraerDinero() {
		try {
			cuenta.extraerDinero(100);
			assertEquals(900, cuenta.getSaldo(),0.01);
		} catch (QuiebraException e) {
			System.out.println(e.getMessage());
		}
		
	}

	
	@Test
	public void masDeMil() {
		cuenta.setSaldo(1400);
		assertTrue(cuenta.masDeMil());
	}

}







