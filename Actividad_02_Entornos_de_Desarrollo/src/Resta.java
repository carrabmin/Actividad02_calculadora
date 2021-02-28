/**
 *Clase para realizar la operación matemática resta. 
 *@author Juan Platero
 *@version 2.0
 *@since 28/02/2021
 */

public class Resta {

	/**
	 * Método para restar dos nº reales.
	 * @param num1 Primer nº real que sea >= 0
	 * @param num2 Segundo nº real que sea >= 0
	 * La salida será la resta de ambos nº.
	 * @return num1 - num2
	 * En el caso de que restemos NaN, el resultado esperado debe ser un NaN.
	 */ 
	
	public double restaDosReales (double num1, double num2){
		return num1 - num2;
	}
	
	
	
	/**
	 * Método para restar dos nº enteros.
	 * @param num1 Primer nº entero que sea >= 0
	 * @param num2 Segundo nº entero que sea >= 0
	 * La salida será la resta de ambos números enteros.
	 * @return num1 - num2
	 */
	
	public int restaEnteros (int num1, int num2) {
		return num1 - num2;
	}
	
	
	/**
	 * Tres parámetros de entrada (3 números reales).
	 * @param num1 Primer nº real que sea >= 0
	 * @param num2 Segundo nº real que sea >= 0
	 * @param num3 Tercer nº real que sea >= 0
	 * La salida será la resta de los tres números reales.
	 * @return num1 - num2 - num3
	 */
		
	public double restaTresReales (double num1, double num2, double num3){
		return num1 - num2 - num3;
	}
		
		
	/**
	 * Un parámetro de entrada (número real o entero)
	 * Utilizamos el acumulador para restar un nuevo número a la resta acumulada.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @param num4
	 * Se usa un acumulador. La salida será la resta acumulada anteriormente menos el nuevo número introducido.
	 * @return resta - num3
	 */
		
		public double restaValorAcumulado (double num1,double num2, double num3) {
			double resta = num1 - num2;
			double acumulador = 0;
			
			return acumulador -= (resta - num3);
			
		}
	
	
}