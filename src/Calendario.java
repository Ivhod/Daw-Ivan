import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el a�o");
		int a�o = input.nextInt();
		int mes;
		do {
		System.out.println("Introduce el mes entre 1 y 12");
		mes = input.nextInt();
		
		} while(mes < 1 || mes > 12); 
		System.out.println("\t\t\t" + mesnombre(mes)+ " " +a�o);
		System.out.println();
		
		System.out.println("________________");
		System.out.println("\tDomingo\tLunes\tMartes\tMiercoles\tJueves\tViernes\tSabado ");
		printmes(a�o,mes);
	}
	public static void printmes (int a�o, int mes) {
		final int PRIMER_DIA = 3;
		int numerodias = getnumerodias(mes,a�o);
		int totaldias = gettotaldias (a�o,mes);
		
		int primerdia = totaldias % 7 + PRIMER_DIA;
		
		System.out.print("\t");
		for (int space = 1; space < primerdia; space++) // Imprime espacios hasta el primer dia
			System.out.print("\t");
		
		for (int d = 1; d <= numerodias; d++) {
			
			System.out.print(d+"\t");
		if ((d + primerdia) % 7 == 0)
			System.out.println("\t");
		}
	}
	public static int gettotaldias(int a�o, int mes) {
		final int A�O = 1800;
		int totaldias = 0;
		for (int y = A�O; y < a�o -1; y++)
			if (a�obisiesto(y))
				totaldias += 366;
				else 
					totaldias += 365;
		for (int MES = 1; MES < mes; MES++)
			totaldias += getnumerodias(mes,a�o);
		return totaldias;
	}
	public static int getnumerodias (int mes, int a�o) {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		if (mes == 2)
			if (a�obisiesto(a�o))
				return 29;
			else
				return 28;
		return 31;
	}
	public static boolean a�obisiesto (int a�o) {
		if (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 ==0)
			return true;
		return false;
	}
	
	public static String mesnombre(int m) {
		String mes = "";
		switch (m) {
		case 1: mes=  "Enero"; break;
		case 2: mes= "Febrero"; break;
		case 3: mes= "Marzo"; break;
		case 4: mes=  "Abril"; break;
		case 5: mes=  "Mayo"; break;
		case 7: mes=  "Junio"; break;
		case 8: mes=  "Agosto"; break;
		case 9: mes=  "Septiembre"; break;
		case 10: mes=  "Octubre"; break;
		case 11: mes=  "Noviembre"; break;
		case 12: mes=  "Diciembre"; break;
		}
		return mes;
	}
}
