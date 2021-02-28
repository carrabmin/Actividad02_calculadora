/**
 *Clase para realizar la operaci�n matem�tica resta. 
 *@author Juan Platero
 *@version 1.0
 *@since 28/02/2021
 */

public class Resta {

	/**
	 * M�todo para restar dos n� reales.
	 * @param num1 Primer n� real que sea >= 0
	 * @param num2 Segundo n� real que sea >= 0
	 * La salida ser� la resta de ambos n�.
	 * @return num1 - num2
	 * En el caso de que restemos NaN, el resultado esperado debe ser un NaN.
	 */ 
	
	public double restaDosReales (double num1, double num2){
		return num1 - num2;
	}
	
	
	
	/**
	 * M�todo para restar dos n� enteros.
	 * @param num1 Primer n� entero que sea >= 0
	 * @param num2 Segundo n� entero que sea >= 0
	 * La salida ser� la resta de ambos n�meros enteros.
	 * @return num1 - num2
	 */
	
	public int restaEnteros (int num1, int num2) {
		return num1 - num2;
	}
	
	
	/**
	 * Tres par�metros de entrada (3 n�meros reales).
	 * @param num1 Primer n� real que sea >= 0
	 * @param num2 Segundo n� real que sea >= 0
	 * @param num3 Tercer n� real que sea >= 0
	 * La salida ser� la resta de los tres n�meros reales.
	 * @return num1 - num2 - num3
	 */
		
	public double restaTresReales (double num1, double num2, double num3){
		return num1 - num2 - num3;
	}
		
		
	/**
	 * Un par�metro de entrada (n�mero real o entero)
	 * Utilizamos el acumulador para restar un nuevo n�mero a la resta acumulada.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 * Se usa un acumulador. La salida ser� la resta acumulada anteriormente menos el nuevo n�mero introducido.
	 * @return resta - num3
	 */
		
		public double restaValorAcumulado (double num1,double num2, double num3) {
			double resta = num1 - num2;
			double acumulador = 0;
			
			return acumulador += (resta - num3);
			
		}
	
	
}