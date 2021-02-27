import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaSuma {
	private Suma cut;

	@BeforeEach
	public void setup() {
		cut = new Suma();
	}

	@AfterEach
	public void tearDown() {

	}

	@Test
	void sumaDosNumeros() {
		int x = 610;
		int y = 9;
		int esperado = 619;

		int obtenido = cut.sumaEnteros(x, y);
		assertEquals(esperado, obtenido, "El resultado de sumar 610 y 9 debe ser 619");
	}
	
	@Test
	void sumaDosNumerosCon0() {
		int x = 0;
		int y = 9;
		int esperado = 9;

		int obtenido = cut.sumaEnteros(x, y);
		assertEquals(esperado, obtenido, "El resultado de sumar 0 y 9 debe ser 9");
	}
	
	@Test
	void sumaDecimales() {
		double x = 2.8;
		double y = 3.3;
		double esperado = 6.1;

		double obtenido = cut.sumaDosReales(x, y);
		assertEquals(esperado, obtenido, "El resultado de sumar 2.8 y 3.3 debe ser 6.1");
	}
	
	@Test
	void sumaDecimalesCon0() {
		double x = 2.8;
		double y = 0;
		double esperado = 2.8;

		double obtenido = cut.sumaDosReales(x, y);
		assertEquals(esperado, obtenido, "El resultado de sumar 2.8 y 0 debe ser 2.8");
	}
	
	@Test
	void sumaTresDecimales() {
		double x = 2.8;
		double y = 3.3;
		double s = 2.4;
		double esperado = 8.5;

		double obtenido = cut.sumaTresReales(x, y, s);
		assertEquals(esperado, obtenido, "El resultado de sumar 2.8, 2.4 y 3.3 debe ser 8.5");
	}
	
	@Test
	void sumaTresDecimalesCon0() {
		double x = 0;
		double y = 0;
		double s = 2.0;
		double esperado = 2.0;

		double obtenido = cut.sumaTresReales(x, y, s);
		assertEquals(esperado, obtenido, "El resultado de sumar 0, 0 y 2.0 debe ser 2.0");
	}
	@Test
	void sumaAcumulada() {
		double x = 2;
		double y = 3;
		double s = 2;
		double esperado = 7;

		double obtenido = cut.sumaValorAcumulado(x, y, s);
		assertEquals(esperado, obtenido, "El resultado de sumar 3 + 2 y ello sumar 2 debe ser 7");
	}
	@Test
	void sumaAcumuladaA0() {
		double x = 0;
		double y = 0;
		double s = 2;
		double esperado = 2;

		double obtenido = cut.sumaValorAcumulado(x, y, s);
		assertEquals(esperado, obtenido, "El resultado de sumar 0 + 0 y ello sumar 2 debe ser 2");
	}
	
	@Test
	void sumaDeNaNDebeSerNan() {
		double x = Double.NaN;
		double y = Double.NaN;
		double esperado = Double.NaN;

		double obtenido = cut.sumaDosReales(x, y);
		assertEquals(esperado, obtenido, "El resultado de la suma de dos NaN debe ser NaN");
	}
	

}