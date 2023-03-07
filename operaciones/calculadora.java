package operaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class calculadora {

	//@Ignore
		//public void testSuma() {
		//	Calculadora calcu = new Calculadora(20, 10);
		//	int resultado = calcu.suma();
		//	assertEquals(30, resultado);
		// }
		
		private Operaciones calcu;
		private int resultado;

		@Before
		public void crearCalculadora() {
		calcu = new Operaciones(20, 10);
		 }

		@After
		public void borrarCalculadora() {
		calcu = null;
		}
		
		
		@Test
		public void comprobarCalculadora()
		{
			//Calculadora calcu = new Calculadora(20,10);
			Operaciones calcu = null;
			assertNotNull("Calculadora nula", calcu);

		}

		@Test // Estamos indicando al compilador que el método que sigue es un método de
				// prueba
		public void testSuma() {
			//Calculadora calcu = new Calculadora(20, 10);
			int resultado = calcu.suma();
			assertEquals(30, resultado);
			
		}

		@Test
		public void testResta() {
			//Calculadora calcu = new Calculadora(20, 10);
			int resultado = calcu.resta();
			assertEquals(10, resultado);

		}
		
		@Test
		public void testResta2() {
		//Calculadora calcu = new Calculadora(15,10);
		boolean resultado1 = calcu.resta2();
		assertTrue(resultado1);
			
		}

		@Test
		public void testMultiplica() {
			//Calculadora calcu = new Calculadora(20, 10);
			int resultado = calcu.multiplica();
			assertEquals("Fallo en la multiplicación", 20, resultado);
		}

		@Test
		public void testDivide() {
			try {
				//Calculadora calcu = new Calculadora(20, 5);
				int resultado = calcu.divide();
				assertEquals(2, resultado);
				//fail("Fallo, Debería haber lanzado la excepción");
			} catch (ArithmeticException e) {
				System.out.println("Prueba satisfactoria");
			}
		}

}
