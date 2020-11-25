import java.util.Scanner;

public class Cartas {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int []deck = newDeck(40);
	        int op;
	        do {
	        	op =menu();
	        	switch(op){
	        	case 1: printDeck(deck);
	        	        break;
	        		
	        	}
	        }while(op!=3);
		}
		public static void printDeck(int[] deck) {
			for (int i=0;i<deck.length;i++) {
				System.out.println(getCardValue(deck[i]) + "  de  "+getSuit(deck[i]));
				
			}
		}
		public static String getCardValue(int c) {
			String [] cards = { "Rey","As", "2","3", "4","5","6","7","Sota","Caballo"};
		
			return cards[c%10];
		}
		public static String getSuit(int n) {
			String [] suits = { "Basto", "Espada"," Oro", "Copa"};
			if (n%10 ==0)
				return suits[n/10-1];
			return suits[n/10];
		}
		public static int[] newDeck(int n) {
			int[] deck = new int[n];
			for (int i=0;i<n;i++)
				deck[i] = i+1;
			return deck;
			
		}
		public static int menu() {
			int op =0;
			Scanner input = new Scanner(System.in);
			System.out.println("Menu");
			System.out.println("\t1.- Print deck");
			System.out.println("\t2.- Shuffling");
			System.out.println("\t3.- Exit");
			System.out.print("\t\tOption:");
			op = input.nextInt();
			return op;
		}
	}
