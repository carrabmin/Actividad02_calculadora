/**
 * clase para dotar a la calculadora de un m�todo para multiplicar y sacar
 * potencias La calculadora no admite n�meros negativos, se lanzar�a un aviso en
 * cada operarici�n
 * 
 * @author esm980
 * @version 1.0
 * @since 01/02/2021
 * 
 */
public class Producto {
	/**
	 * Constructor vacio para crear objeto, para poder generar un objeto
	 */
	public Producto() {
		super();
	}

	/**
	 * para multiplicar dos n�meros enteros en caso que uno de los par�metros sea 0,
	 * el resultado siempre ser� 0 
	 * Caso especial: los par�metros metidos deben de
	 * estar entre 0 y 9,223,372,036,854,775,807. De lo contrario saltar�a error
	 * 
	 * @param x
	 * @param a
	 * @return x * a
	 */
	public long multiplicar(long x, long a) {
		return x * a;
	}

	/**
	 * para multiplicar con dos n�meros reales en caso que uno de los par�metros sea
	 * 0, el resultado siempre ser� 0 
	 * Caso especial: los par�metros metidos deben de
	 * estar entre 0 y 1.797E308. De lo contrario saltar�a error
	 * Caso Especial: en el caso de alg�n par�metro NaN el resultado ser�a otro NaN
	 * 
	 * @param x
	 * @param a
	 * @return x * a
	 */
	public double multiplicar(double x, double a) {
		return x * a;
	}

	/**
	 * para multiplicar tres n�meros a la vez, tanto reales como enteros en caso que
	 * uno de los par�metros sea 0, el resultado siempre ser� 0 los par�metros 
	 * Caso especial: metidos deben de estar entre 0 y 1.797E308. De lo contrario saltar�a
	 * error.
	 * 
	 * @param x
	 * @param a
	 * @param c
	 * @return x * a * c
	 */
	public double multiplicar(double x, double a, double c) {
		return x * a * c;
	}

	/**
	 * para sacar la potencia de un n�mero entero en caso que el par�metro x sea 0,
	 * el resultado siempre ser� 0. En caso que el par�metro a sea 0, el resultado
	 * ser� siempre 1 independientemete del par�metro de su base us�mos el tipo de
	 * par�metros long para ampliar la capacidad de los n�meros introducidos 
	 * Caso Especial: los par�metros metidos deben de estar entre 0 y 9223372036854775807.
	 * De lo contrario saltar�a error
	 * 
	 * @param x
	 * @param a
	 * @return Potencia de x elevado a a
	 */
	public long potencia(long x, long a) {
		return (long) Math.pow(x, a);
	}

	/**
	 * para sacar la potencia de un n�mero real en caso que el par�metro x sea 0, el
	 * resultado siempre ser� 0. En caso que el par�metro a sea 0, el resultado ser�
	 * siempre 1 independientemete del par�metro de su base 
	 * Caso Especial: los par�metros metidos deben de estar entre 0 y 1.797E308. De lo contrario
	 * saltar�a error 
	 * Caso Especial: en el caso de alg�n par�metro NaN el resultado dar�a un NaN
	 * 
	 * @param x
	 * @param a
	 * @return Potencia de x elevado a a
	 */
	public double potencia(double x, double a) {
		return Math.pow(x, a);
	}

}