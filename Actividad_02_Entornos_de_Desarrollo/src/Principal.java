
public class Principal {

	public static void main(String[] args) {
		Producto pro1 = new Producto();
		Operacion op1 = new Operacion();
		
			System.out.println("El resultado de la multiplicación de dos números pasados por pantallas es " + pro1.multiplicar(2, 7));
			
			System.out.println("El resultado de aplicar el método factorial a 5 debería ser: 120 -> " + op1.factorial(5));
	}

}
