/**
 * Clase Cociente, ejercicio grupal 1
 * @author Juank
 *@version 1.0
 *@since 01/02/2021
 *
 * CASO ESPECIAL: Si nos introducen n�meros negativos, mostraremos un mensaje por pantalla 
 * indicando que s�lo funciona con n�meros positivos
 *  
 * CASO ESPECIAL: Si la divisi�n devuelve un resto diferente a 0, significa que esta no es exacta.
 */ 

public class Cociente {
	
	/**
	 * Leemos dos parametros enteros distintos
	 * @param a se usa
	 * @param b se usa
	 * CASO ESPECIAL: Si uno de los par�metros es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la divisi�n de ambos par�metros recibidos
	 * @return a/b
	 */

	public int cocienteEnteros (int a, int b) {
		return a / b;
	}
	
	/**
	 * Leemos dos parametros Reales distintos
	 * @param a se usa 
	 * @param b se usa 
	 * CASO ESPECIAL: Si uno de los par�metros es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la divisi�n de ambos par�metros recibidos
	 * @return a/b
	 */
	
	public double cocienteReales (double a, double b) {
		return a / b;
	}
	
	/**
	 * Recibimos un solo par�metro
	 * @param a se usa
	 * CASO ESPECIAL: Si el parametro recibido es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la division de 1 con el par�metro recibido
	 * @return 1/a
	 * 
	 */
	
	public int cocienteInverso (int a) {
		return 1 / a;
	}
	
	/**
	 * Recibimos un solo par�metro
	 * @param a se usa
	 * CASO ESPECIAL: Si el parametro recibido es 0, el resultado ser� 0.
	 * Realizamos una ra�z cuadrada con la funci�n Math.random
	 * @return a = (int) Math.random()
	 */
	
	public int cocienteRaiz (int a) {
		return a = (int) Math.random();
	}
}
