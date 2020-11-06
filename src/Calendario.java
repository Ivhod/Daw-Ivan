import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el año");
		int año = input.nextInt();
		int mes;
		do {
		System.out.println("Introduce el mes entre 1 y 12");
		mes = input.nextInt();
		
		} while(mes < 1 || mes > 12); 
		System.out.println("\t\t\t" + mesnombre(mes)+ " " +año);
		System.out.println();
		
		System.out.println("________________");
		System.out.println("\tDomingo\tLunes\tMartes\tMiercoles\tJueves\tViernes\tSabado ");
		printmes(año,mes);
	}
	public static void printmes (int año, int mes) {
		final int PRIMER_DIA = 3;
		int numerodias = getnumerodias(mes,año);
		int totaldias = gettotaldias (año,mes);
		
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
	public static int gettotaldias(int año, int mes) {
		final int AÑO = 1800;
		int totaldias = 0;
		for (int y = AÑO; y < año -1; y++)
			if (añobisiesto(y))
				totaldias += 366;
				else 
					totaldias += 365;
		for (int MES = 1; MES < mes; MES++)
			totaldias += getnumerodias(mes,año);
		return totaldias;
	}
	public static int getnumerodias (int mes, int año) {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		if (mes == 2)
			if (añobisiesto(año))
				return 29;
			else
				return 28;
		return 31;
	}
	public static boolean añobisiesto (int año) {
		if (año % 4 == 0 && año % 100 != 0 || año % 400 ==0)
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
