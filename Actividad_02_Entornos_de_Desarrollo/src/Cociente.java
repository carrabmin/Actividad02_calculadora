/**
 * Clase Cociente, ejercicio grupal 1
 * @author Juank
 *@version 1.0
 *@since 01/02/2021
 *
 * CASO ESPECIAL: Si nos introducen números negativos, mostraremos un mensaje por pantalla 
 * indicando que sólo funciona con números positivos
 *  
 * CASO ESPECIAL: Si la división devuelve un resto diferente a 0, significa que esta no es exacta.
 */ 

public class Cociente {
	
	/**
	 * Leemos dos parametros enteros distintos
	 * @param a se usa
	 * @param b se usa
	 * CASO ESPECIAL: Si uno de los parámetros es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la división de ambos parámetros recibidos
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
	 * CASO ESPECIAL: Si uno de los parámetros es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la división de ambos parámetros recibidos
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
	 * CASO ESPECIAL: Si uno de los parámetros es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la división de ambos parámetros recibidos
	 * @return a/b
	 */
	
	public double cocienteReales (double a, double b) {
		if (b == 0)
			return Double.NaN;
		return a / b;
	}

	/**
	 * Recibimos un solo parámetro
	 * @param a se usa
	 * CASO ESPECIAL: Si el parametro recibido es 0, no obtendremos un resultado bien definido.
	 * Devolvemos la division de 1 con el parámetro recibido
	 * @return 1/a
	 * 
	 */
	
	public int cocienteInverso (double a) {
		return (int) (1 / a);
	}
	
	/**
	 * Recibimos un solo parámetro
	 * @param base 
	 * @param raiz
	 * CASO ESPECIAL: Si el parametro recibido es 0, el resultado será 0.
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



