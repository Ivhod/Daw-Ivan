package objetos;

import java.util.Scanner;

public class TestIBM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double peso;
		double altura;
		
		System.out.println("Introduce tu peso en Kg");
		peso= input.nextInt();
		
		System.out.println("Introduce tu altura en M");
		altura= input.nextInt();
		
		IBM imc1 = new IBM(peso,altura);
		
		System.out.println("Tu IMC es " +imc1.getIMC()+ " " +imc1.report());
	}

}
