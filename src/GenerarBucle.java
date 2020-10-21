import java.util.Scanner;

public class GenerarBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = (int) (Math.random() * 101);		
		int fallo = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Introduce el numero que crees que es el generado ");
		
		int numeropersona = input.nextInt();
		
		while (numero1 != numeropersona) {
			System.out.println(numero1);
			if (numero1 > numeropersona) {
				System.out.println(" No coincide con el numero aleatorio, vuelve a introducir un numero mas alto ");
				numeropersona = input.nextInt();
			}
			else if (numero1 < numeropersona) {
				System.out.println(" No coincide con el numero aleatorio, vuelve a introducir un numero mas bajo ");
				numeropersona = input.nextInt();
				fallo++;
			}		
		}
		System.out.println(" Coincide el numero aleatorio, " + fallo + " veces has fallado ");
	}

}
