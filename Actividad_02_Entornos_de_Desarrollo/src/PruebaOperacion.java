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
	
	//Test esPrimo
	@Test
	void testEsPrimo() {
		int a = 5;
		boolean esperado =  true;
		boolean obtenido = cut.esPrimo(a);
		assertEquals (esperado, obtenido, "el resultado debe ser true");
	}
	@Test
	void testEsPrimoCon0() {
		int a = 0;
		boolean esperado =  false;
		boolean obtenido = cut.esPrimo(a);
		assertEquals (esperado, obtenido, "el resultado debe ser false");
	}
	
	
	//Test posicionPrimo
	@Test
	void testPosicionPrimo() {
		int a = 7;
		int esperado = 17;
		int obtenido = cut.posicionPrimo(a);
		assertEquals (esperado, obtenido, "el resultado debe ser 17");
	}
	@Test
	void testPosicionPrimocon0() {
		int a = 0;
		int esperado = 0;
		int obtenido = cut.posicionPrimo(a);
		assertEquals (esperado, obtenido, "el resultado debe ser true");
	}
	
	
	//Test porcentaje
	@Test
	void testPorcentaje() {
		double a = 40;
		double b = 25;
		double esperado = 10;
		double obtenido = cut.calcularPorcentaje(a, b);
		assertEquals (esperado, obtenido, "el resultado es 10");
	}
	
	
	//TestFactorial
	@Test
	void testFactorial() {
		int a = 5;
		int esperado = 120;
		int obtenido = cut.factorial(a);
		assertEquals (esperado, obtenido, "el resultado debe ser 120");
	}

}
