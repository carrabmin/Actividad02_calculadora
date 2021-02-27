import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaCociente {
	private Cociente cut;
	
	@BeforeEach
	public void setUp() {
		cut = new Cociente ();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
	
	
	@Test
	void elCocienteDe10Entre5DebeSer2() {
		double x = 10;
		double y = 5;
		double esperado = 2;
		
		double obtenido = cut.cocienteReales(x, y);
		assertEquals (esperado, obtenido, "El resultado de dividir 10 entre 5 debe ser 2"); 
		
	}

	@Test
	void cocientesEnteros() {
		int x = 10;
		int y = 5;
		int esperado = 2;
		
		int obtenido = cut.cocienteEnteros(x, y);
		assertEquals(esperado, obtenido, "El resultado de dividir 10 entre 5 debe ser 2"); 
	
	}
	
	@Test
	void primerParametroEntradaEs0() {
		double x = 0;
		double y = 5;
		double esperado = 0;
		
		double obtenido = cut.cocienteReales(x, y);
		assertEquals (esperado, obtenido, "El resultado de dividir 0 entre cualquier número debe ser 0"); 
		
	}
	@Test
	void segundoParametroEntradaEs0() {
		double x = 5;
		double y = 0;
		double esperado = Double.NaN;
		
		double obtenido = cut.cocienteReales(x, y);
		assertEquals (esperado, obtenido, "El resultado de dividir cualquier numero entre 0 debe ser NaN"); 
		
	}
	@Test
	void cocientesInversoDe5() {
		double x = 5;
		
		double esperado = 0.2;
		
		double obtenido = cut.cocienteInverso(x);
		assertEquals (esperado, obtenido, "El resultado de hacer cociente inverso de 5 debe ser 0.2"); 
	
	}
	
	@Test
	void SegundaRaizDe25() {
		double x = 25;
		double a = 2;
		
		double esperado = 5;
		double obtenido = cut.cocienteRaiz(x, a);
		assertEquals (esperado, obtenido, "El resultado de la raíz cuadrada de 25 debe ser 5"); 
	
	}
	@Test
	void laRaizDeNANDebeSerNAN() {
		double x = Double.NaN;
		double a = Double.NaN;
		
		double esperado = Double.NaN;
		double obtenido = cut.cocienteRaiz(x, a);
		assertEquals(esperado, obtenido, "La raiz de NaN debe ser NaN");
	}
	
}
