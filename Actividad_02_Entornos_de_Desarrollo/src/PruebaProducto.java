import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaProducto {

	private Producto cut;
	
	@BeforeEach
	public void setUp() {
		// 1Arrange - Preparar
		cut = new Producto();
	}
	
	@AfterEach
	public void tearDown() {
		
	}
	
	@Test
	void elProductoDe5Por100DebeSer500() {
		// 1 Arrange - Preparar
		double x = 5;
		double a = 100;
		double esperado = 500;
		// 2 Act - Ejecutar
		double obtenido = cut.multiplicar(x, a);
		// 3 Assert - Comprobar
		assertEquals(esperado, obtenido, "El Producto de 5 por 100 debe ser 500");
	}
	
	@Test
	void elProductoDe5Por20Por10DebeSer1000() {
		// 1 Arrange - Preparar
		double x = 5;
		double a = 20;
		double c = 10;
		double esperado = 1000;
		// 2 Act - Ejecutar
		double obtenido = cut.multiplicar(x, a, c);
		// 3 Assert - Comprobar
		assertEquals(esperado, obtenido, "El producto de 5 por 20 por 10 debe ser 1000");
	}
	
	@Test
	void laPotenciaDe4ElevadoA3DebeSer64() {
		// 1 Arrange - Preparar
		double x = 4;
		double a = 3;
		double esperado = 64;
		// 2 Act - Ejecutar
		double obtenido = cut.potencia(x, a);
		// 3 Assert - Comprobar
		assertEquals(esperado, obtenido, "La Potencia de 4 elevado a 3 debe ser 64");
	}
	
	@Test
	void laPotenciaDe4ElevadoA0DebeSer1() {
		// 1 Arrange - Preparar
		double x = 4;
		double a = 0;
		double esperado = 1;
		// 2 Act - Ejecutar
		double obtenido = cut.potencia(x, a);
		// 3 Assert - Comprobar
		assertEquals(esperado, obtenido, "La Potencia de 4 elevado a 0 debe ser 1");
	}
	
	@Test
	void laPotenciaDeNaNElevadoANaNDebeSerNaN() {
		// 1 Arrange - Preparar
		double x = Double.NaN;
		double a = Double.NaN;
		double esperado = Double.NaN;
		// 2 Act - Ejecutar
		double obtenido = cut.potencia(x, a);
		// 3 Assert - Comprobar
		assertEquals(esperado, obtenido, "La Potencia de NaN elevado a NaN debe ser NaN");
		}
	
}
	
	

