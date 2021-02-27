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
	
	public Cociente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Leemos dos parametros enteros distintos
	 * @param a se usa
	 * @param b se usa
	 * CASO ESPECIAL: Si uno de los par�metros es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la divisi�n de ambos par�metros recibidos
	 * @return a/b
	 */

	
	public int cocienteEnteros (int a, int b) {
		if (b == 0)
			return (int) Double.NaN;
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
		if (b == 0)
			return Double.NaN;
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
	 * @param base 
	 * @param raiz
	 * CASO ESPECIAL: Si el parametro recibido es 0, el resultado ser� 0.
	 * @return resultado
	 */
	
public double cocienteRaiz(double base, double raiz) {
		
		double resultado = Math.pow(base, 1.0/raiz);
		double siguiente = Math.ceil(resultado);
		
		if(siguiente - resultado <0.0000001) {
			return siguiente;
		}else {
			return resultado;
		}
	}
}



