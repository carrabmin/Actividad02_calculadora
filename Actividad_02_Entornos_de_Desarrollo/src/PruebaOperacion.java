import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaOperacion {

	private Operacion cut;
	
	@BeforeEach
	public void setUp() {
		cut = new Operacion();
	}
	
	@AfterEach
	public void tearDown() {
	}
	
	@Test
	void testEsPrimo() {
		int a = 5;
		boolean esperado =  true;
		boolean obtenido = cut.esPrimo(a);
		assertEquals (esperado, obtenido, "el resultado debe ser true");
	}
	
	@Test
	void testPosicionPrimo() {
		int a = 7;
		boolean esperado = true;
		boolean obtenido = cut.esPrimo(a);
		assertEquals (esperado, obtenido, "el resultado debe ser true");
	}
	
	@Test
	void testPorcentaje() {
		int a = 40;
		int b = 25;
		int esperado = 10;
		int obtenido = cut.calcularPorcentaje(a, b);
		assertEquals (esperado, obtenido, "el resultado es 10");
	}
	
	@Test
	void testFactorial() {
		int a = 5;
		int esperado = 120;
		int obtenido = cut.factorial(a);
		assertEquals (esperado, obtenido, "el resultado debe ser 120");
	}

}
