
/**
 *Clase para realizar la operaci�n matem�tica suma. 
 *@author Juan Platero
 *@version 1.0
 *@since 29/01/2021
 */

public class Suma {

/**
 * M�todo para sumar dos n� reales.
 * @param num1 Primer n� real que sea >= 0
 * @param num2 Segundo n� real que sea >= 0
 * La salida ser� la suma de ambos n�.
 * @return num1 + num2
 */ 
	
	public double sumaDosReales (double num1, double num2){
		return num1 + num2;
	}
	
	/**
	 * M�todo para sumar dos n� enteros.
	 * @param num1 Primer n� entero que sea >= 0
	 * @param num2 Segundo n� entero que sea >= 0
	 * La salida ser� la suma de ambos n�meros enteros.
	 * @return num1 + num2
	 */
	
	public int sumaEnteros (int num1, int num2) {
		return num1 + num2;
	}
	
	
	/**
	 * Tres par�metros de entrada (3 n�meros reales).
	 * @param num1 Primer n� real que sea >= 0
	 * @param num2 Segundo n� real que sea >= 0
	 * @param num3 Tercer n� real que sea >= 0
	 * La salida ser� la suma de los tres n�meros reales.
	 * @return num1 + num2 + num3
	 */
		
		public double sumaTresReales (double num1, double num2, double num3){
			return num1 + num2 + num3;
		}
		
		
		/**
		 * Un par�metro de entrada (n�mero real o entero)
		 * Utilizamos el acumulador para sumar un nuevo n�mero a la suma acumulada.
		 * @param num1
		 * @param num2
		 * @param num3
		 * @param num4
		 * La salida ser� la suma acumulada anteriormente m�s el nuevo n�mero introducido.
		 * @return suma + num3
		 */
		
		public double sumaValorAcumulado (double num1,double num2, double num3) {
			double suma = num1 + num2;
			double acumulador = 0;
			
			return acumulador += (suma + num3);
			
		}
	
	
}