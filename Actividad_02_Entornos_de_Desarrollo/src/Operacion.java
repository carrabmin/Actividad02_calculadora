/**
 * Esta es una clase del proyecto Calculadora que realiza operaciones
 * 
 * @author Carlos Rabinal M�nguez
 * @version 1.0
 * @since 30/01/2021
 * 
 * CASO ESPECIAL: Si la calculadora no pudiera utilizar n�meros negativos,
 * mostraremos un mensaje por pantalla para advertir que s�lo podemos introducir n�meros positivos
 *
 * 
 */

public class Operacion {
	
	/**
	 * Este es un m�todo constructor vac�o (sin par�metros)
	 */
		public Operacion() {
			super();
		}

	/**
	 * Este es el m�todo booleano para calcular si un n�mero es primo o no
	 * 
	 * @param n es el par�metro que introducimos para averiguar si dicho n�mero es primo o no
	 * @return true si el n�mero es primo y false si no es n�mero primo
	 * 
	 *  CASO ESPECIAL: Si introducimos un cero como par�metro, el m�todo nos devuelve false
	 */
		public boolean esPrimo(int n){
		    int a = 0;
		        for (int i = 1; i < (n + 1); i++) 
		            if (n % i == 0) 
		                a++;
		        if (a != 2) 
		           return false;
		         else 
		          return true;
		    }
		
		/**
		 * Este es el m�todo que averigua el n�mero primo asociado
		 * a la posicion que pasamos como par�metro
		 * 
		 * @param posicion que queremos averiguar del n�mero primo
		 * @return el n�mero primo asociado a la posici�n
		 * 
		 * CASO ESPECIAL: Si introducimos un cero como par�metro, informamos por consola que no es una posici�n permitida
		 */
			public int posicionPrimo(int posicion) {
				
				if(posicion<=0){
					   System.out.println("ERROR: Posici�n no permitida");
				}
				
				 int primos[] = new int[posicion];
				 	primos[0] = 2;
			    	primos[1] = 3;
				 int probar = 3, numeroDePrimosActual = 2;
				   
				   if(posicion == 1){
				     } else if(posicion == 2) {
				     } else {
				 
				     while(numeroDePrimosActual < posicion){
				     probar = probar + 2;
				     int contador = 0;
				 
				            while(probar % primos[contador] > 0 && contador < numeroDePrimosActual && probar * 10 / primos[contador] > 9 ){
				             if(contador + 1 == numeroDePrimosActual ){
				             primos[numeroDePrimosActual] = probar;
				             numeroDePrimosActual = (numeroDePrimosActual + 1);
				             } else {
				               }
				             contador = (contador + 1);
				             }
				      }
				     }
				return primos[posicion - 1];
			}
			
		/**
		 * Este es un m�todo que calcula el porcentaje de un n�mero
		 *  
		 * @param numero sobre el que queremos calcular el porcentaje
		 * @param porcentaje que queremos calcular sobre el n�mero
		 * @return f�rmula para calcular el porcentaje
		 * 
		 * CASO ESPECIAL: Si introducimos un cero como par�metro, el resultado ser� cero
		 */
			public double calcularPorcentaje(double numero, double porcentaje) {
				return (numero * porcentaje/100);
			}
				
		/**
		 * Este es un m�todo para calcular el factorial de un n�mero
		 * 
		 * @param n es el n�mero sobre el que queremos calcular el factorial
		 * @return resultado de calcular el factorial del n�mero
		 * 
		 * CASO ESPECIAL: Si introducimos un cero como par�metro, el resultado ser� 1
		 */
				
			public int factorial(int n) {
		        int resultado = 1;
		        for (int i = 1; i <= n; i++) {
		            resultado *= i;
		        }
		        return resultado;
			}
			
			
}			



