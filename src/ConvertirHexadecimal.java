import java.util.Scanner;

public class ConvertirHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un numero decimal para convertirlo en Hexadecimal");
		int decimal = input.nextInt();
		String hex = "";
		
		while (decimal !=0) {
			int hexvalor = decimal % 16;
			
		char hexdigito;
		if (0 <= hexvalor && hexvalor <= 9){
			hexdigito = (char)(hexvalor + '0');
			
		}
		else 
			hexdigito = (char)(hexvalor - 10 + 'A');
		System.out.println(hexdigito);
		hex = hexdigito + hex;
		System.out.println(hex);
		decimal = decimal / 16;
		}
		System.out.println("El numero es" + hex);
	}
	}

