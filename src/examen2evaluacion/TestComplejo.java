package examen2evaluacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TestComplejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo c1 = new Complejo(1.0,1.0);
		Complejo c2 = new Complejo(2.0,2.0);
		Complejo c3 = null;		
		try {
			int op;	
		do {
			op=menu();
			switch(op){
			case 1:
				c3=c1.sumar(c2);
				System.out.println("-Suma:");
				System.out.println(c1+ " + " + c2 + " = "+ c3);
				break;
			case 2:
				c3=c1.producto(c2);
				System.out.println("-Multiplicacion:");
				System.out.println(c1 + " * " + c2 + " = " + c3);
				break;
			case 3:
				c3 = c1.cociente(c2);
				System.out.println("-Division:");
		        System.out.println(c1 + " / " + c2 + " = " + c3);
		        break;
			case 4: 
				if (c2.equals(c3)) {
		            System.out.println(c2 + " igual que " + c3);
		        } else {
		            System.out.println(c2 + " distinto que " + c3);
		        }
				break;
			
			}
		}while (op != 5);
		}catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	public static int menu() {
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Numeros Complejos");
		System.out.println("......................");
		System.out.println("1. Suma:");
		System.out.println("2. Multiplicacion:");
		System.out.println("3. Division");
		System.out.println("4. Comprobar si son iguales o no:");
		op = teclado.nextInt();
		return op;
	}
	public ArrayList<String> getComplejo(double real, double imag){
		ArrayList<String> Complejos = new ArrayList<String>();
		Collections.sort(Complejos);
		return Complejos;
		
	}
}



