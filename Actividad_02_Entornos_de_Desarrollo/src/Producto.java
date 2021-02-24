/**
 * clase para dotar a la calculadora de un método para multiplicar y sacar
 * potencias La calculadora no admite números negativos, se lanzaría un aviso en
 * cada operarición
 * 
 * @author esm980
 * @version 1.0
 * @since 01/02/2021
 * 
 */
public class Producto {
	/**
	 * Constructor vacio para crear objeto
	 */
	public Producto() {
		super();
	}

	/**
	 * para multiplicar dos números enteros en caso que uno de los parámetros sea 0,
	 * el resultado siempre será 0 los parámetros metidos deben de esar entre 0 y
	 * 9223372036854775807. De lo contrario saltaría error
	 * 
	 * @param x
	 * @param a
	 * @return x * a
	 */
	public long multiplicar(long x, long a) {
		return x * a;
	}

	/**
	 * para multiplicar con dos números reales en caso que uno de los parámetros sea
	 * 0, el resultado siempre será 0 los parámetros metidos deben de esar entre 0 y
	 * 1.797E308. De lo contrario saltaría error
	 * 
	 * @param x
	 * @param a
	 * @return x * a
	 */
	public double multiplicar(double x, double a) {
		return x * a;
	}

	/**
	 * para multiplicar tres números a la vez, tanto reales como enteros en caso que
	 * uno de los parámetros sea 0, el resultado siempre será 0 los parámetros
	 * metidos deben de esar entre 0 y 1.797E308. De lo contrario saltaría error.
	 * 
	 * @param x
	 * @param a
	 * @param c
	 * @return x * a * c
	 */
	public double multiplicar(double x, double a, double c) {
		return x * a * c;
	}

}