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
	void test1() {
	}
	
	@Test
	void test2() {
	}
	
	@Test
	void test3() {
	}

}
