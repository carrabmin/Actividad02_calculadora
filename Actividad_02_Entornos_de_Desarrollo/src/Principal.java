
public class Principal {

	public static void main(String[] args) {
		Producto pro1 = new Producto();
		Operacion op1 = new Operacion();
		
			System.out.println("El resultado de la multiplicaci�n de dos n�meros pasados por pantallas es " + pro1.multiplicar(2, 7));
			
			System.out.println("El resultado de aplicar el m�todo factorial a 5 deber�a ser: 120 -> " + op1.factorial(5));
	}

}
