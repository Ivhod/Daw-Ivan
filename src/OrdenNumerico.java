
public class OrdenNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int numero1 = (int)(Math.random()*100);
	int numero2 = (int)(Math.random()*100);
	int numero3 = (int)(Math.random()*100);
	
	System.out.println(numero1 + " " + numero2 + " " + numero3);
	
	if (numero1 < numero2)
		if(numero3 < numero2)
			System.out.println(numero3 + " " + numero1 + " " + numero2 );
		else //(a<c)
			if(numero3 < numero2)
				System.out.println(numero1 + " " + numero3 + " " + numero2);
			else //(b<c)
				System.out.println(numero1 + " " + numero2 + "  " + numero3);
	
	else //b<a
		if (numero3 < numero1)
			System.out.println(numero3 + " " + numero2 + " " + numero1);
		else 
			if (numero3 < numero1)
				System.out.println(numero2 + " " + numero3 +  " " + numero1);
			else
				System.out.println(numero2 + " " + numero1 + " " + numero3);
	

	}

}
