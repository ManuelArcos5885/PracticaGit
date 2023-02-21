package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadora {

	@Test
	void testSuma() {
		Operaciones oper =  new Operaciones();
		int resultado = oper.suma(20, 10);
		assertEquals(30, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testResta() {
		fail("Not yet implemented");
	}

	@Test
	void testMedia() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplicacion() {
		fail("Not yet implemented");
	}

}
