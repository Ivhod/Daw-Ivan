import java.util.Scanner;

public class PalabraPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una palabra para comprobar si es palindrome ");
		String palabra = input.nextLine();
		
		int high = palabra.length() - 1;
		int low = 0;
		
		boolean palindrome = true;
		while (low < high) {
		      if (palabra.charAt(low) != palabra.charAt(high)) {
		        palindrome = false;
		        break;
		      }

		      low++;
		      high--;
		    }

		    if (palindrome)
		      System.out.println(palabra + " es palindrome");
		    else
		      System.out.println(palabra + " no es palindrome");
		  }
		
	}


