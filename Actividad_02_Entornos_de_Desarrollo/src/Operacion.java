/**
 * Esta es una clase del proyecto Calculadora que realiza operaciones
 * 
 * @author Carlos Rabinal Mínguez
 * @version 1.0
 * @since 30/01/2021
 * 
 * CASO ESPECIAL: Si la calculadora no pudiera utilizar números negativos,
 * mostraremos un mensaje por pantalla para advertir que sólo podemos introducir números positivos
 *
 * 
 */

public class Operacion {
	
	/**
	 * Este es un método constructor vacío (sin parámetros)
	 */
		public Operacion() {
			super();
		}

	/**
	 * Este es el método booleano para calcular si un número es primo o no
	 * 
	 * @param n es el parámetro que introducimos para averiguar si dicho número es primo o no
	 * @return true si el número es primo y false si no es número primo
	 * 
	 *  CASO ESPECIAL: Si introducimos un cero como parámetro, el método nos devuelve false
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
		 * Este es el método que averigua el número primo asociado
		 * a la posicion que pasamos como parámetro
		 * 
		 * @param posicion que queremos averiguar del número primo
		 * @return el número primo asociado a la posición
		 * 
		 * CASO ESPECIAL: Si introducimos un cero como parámetro, informamos por consola que no es una posición permitida
		 */
			public int posicionPrimo(int posicion) {
				
				if(posicion<=0){
					   System.out.println("ERROR: Posición no permitida");
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
		 * Este es un método que calcula el porcentaje de un número
		 *  
		 * @param numero sobre el que queremos calcular el porcentaje
		 * @param porcentaje que queremos calcular sobre el número
		 * @return fórmula para calcular el porcentaje
		 * 
		 * CASO ESPECIAL: Si introducimos un cero como parámetro, el resultado será cero
		 */
			public int calcularPorcentaje(int numero, int porcentaje) {
				return (numero * porcentaje/100);
			}
				
		/**
		 * Este es un método para calcular el factorial de un número
		 * 
		 * @param n es el número sobre el que queremos calcular el factorial
		 * @return resultado de calcular el factorial del número
		 * 
		 * CASO ESPECIAL: Si introducimos un cero como parámetro, el resultado será 1
		 */
				
			public int factorial(int n) {
		        int resultado = 1;
		        for (int i = 1; i <= n; i++) {
		            resultado *= i;
		        }
		        return resultado;
			}
			
			
}			



