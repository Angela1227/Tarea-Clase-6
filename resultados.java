
public class resultados {

	public static void main(String[] args) {
		calculadora op = new calculadora();
		
		/*
		 1. El resultado de multiplicar 80 por 3 da 240
2. El resultado de sumar 150 y 180, dividido por 3, da 110
3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.

		 * */
		
		System.out.println(op.multiplicar(3, 80));
		int dos = op.sumar(150, 180);
		int tres = op.restar(90, 50);
		int cuatro = op.sumar(70, 40);
		
		System.out.println(op.dividir(dos, 3));
		System.out.println(op.multiplicar(tres, 15));
		System.out.println(op.multiplicar(cuatro, 25));
		
		
		
	
	}

}
