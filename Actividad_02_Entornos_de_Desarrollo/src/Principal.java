
public class Principal {

	public static void main(String[] args) {
		Producto pro1 = new Producto();
		Operacion op1 = new Operacion();
		
			System.out.println("El resultado de la multiplicaci�n de 2 X 7 es: " + pro1.multiplicar(2, 7));
			System.out.println("El resultado de la potencia de 0 elevado a 2 es: " + pro1.potencia(0, 2));
			System.out.println("El resultado de la potencia de 2 elevado a 0 es: " + pro1.potencia(2, 0));
			System.out.println("El resultado de la potencia de 2 elevado a 0 es: " + pro1.potencia(0, 0));
			
			System.out.println("El resultado de aplicar el m�todo factorial a 5 deber�a ser: 120 -> " + op1.factorial(5));
	}

}
