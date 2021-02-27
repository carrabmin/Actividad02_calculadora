
/**
 *Clase para realizar la operación matemática suma. 
 *@author Juan Platero
 *@version 1.0
 *@since 29/01/2021
 */

public class Suma {

/**
 * Método para sumar dos nº reales.
 * @param num1 Primer nº real que sea >= 0
 * @param num2 Segundo nº real que sea >= 0
 * La salida será la suma de ambos nº.
 * @return num1 + num2
 */ 
	
	public double sumaDosReales (double num1, double num2){
		return num1 + num2;
	}
	
	
	
	/**
	 * Método para sumar dos nº enteros.
	 * @param num1 Primer nº entero que sea >= 0
	 * @param num2 Segundo nº entero que sea >= 0
	 * La salida será la suma de ambos números enteros.
	 * @return num1 + num2
	 */
	
	public int sumaEnteros (int num1, int num2) {
		return num1 + num2;
	}
	
	
	/**
	 * Tres parámetros de entrada (3 números reales).
	 * @param num1 Primer nº real que sea >= 0
	 * @param num2 Segundo nº real que sea >= 0
	 * @param num3 Tercer nº real que sea >= 0
	 * La salida será la suma de los tres números reales.
	 * @return num1 + num2 + num3
	 */
		
		public double sumaTresReales (double num1, double num2, double num3){
			return num1 + num2 + num3;
		}
		
		
		/**
		 * Un parámetro de entrada (número real o entero)
		 * Utilizamos el acumulador para sumar un nuevo número a la suma acumulada.
		 * @param num1
		 * @param num2
		 * @param num3
		 * @param num4
		 * Se usa un acumulador. La salida será la suma acumulada anteriormente más el nuevo número introducido.
		 * @return suma + num3
		 */
		
		public double sumaValorAcumulado (double num1,double num2, double num3) {
			double suma = num1 + num2;
			double acumulador = 0;
			
			return acumulador += (suma + num3);
			
		}
	
	
}