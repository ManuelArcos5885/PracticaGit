package cuentaBancaria;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class CuentaTest {

	private Cuenta cuenta;
	private float saldo;
	
	
	
	@Before
	public void crearCalculadora() {
	cuenta = new Cuenta("P3p4rt", 1000);
	 }
	
	
	@Test
	void testGetSaldo() {
		assertEquals(1000, cuenta.getSaldo());
	}

	@Test
	void testSetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarDinero() {
		fail("Not yet implemented");
	}

	@Test
	void testExtraerDinero() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarCuenta() {
		fail("Not yet implemented");
	}

}
