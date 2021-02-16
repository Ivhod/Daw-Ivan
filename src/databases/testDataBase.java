package databases;

import java.util.Scanner;

import objetos.User;
import objetos.Messages;

public class testDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DBEmail db = new DBEmail();
			// System.out.println("Vale, estas conectado a la BD");
			int op;
			int op2;
			User user;
			Messages mensaje;
			do {
				op = menu();
				switch (op) {
				case 1:
					user = login(db);
					if (user != null) {
						insideSystem(db, user);
					} else
						System.out.println("You have to register.");
					op2 = menu2();
					switch (op2) {
					case 1: 
						
					}
				case 2: 
					boolean inserted = newUser(db);
					if(inserted)
						System.out.println("Usuario registrado con éxito. Ve a logearte");
					else
						System.out.println("Problems with registration");
					break;
				}
			} while (op != 4);

		} catch (Exception ex) {
			System.out.println("Red code You are NOT connected to EMAIL");
		}
	}

	public static int menu() {
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menú");
		System.out.println(".....");
		System.out.println("1. Log In");
		System.out.println("2. Register");
		op = teclado.nextInt();
		return op;
	}

	public static User login(DBEmail db) throws Exception {
		User u;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Login: ");
		System.out.println("Enter your name");
		String name = teclado.next();
		System.out.println("Enter your password");
		String pass = teclado.next();
		u = db.getUser(name, pass);
		return u;
	}

	public static void insideSystem(DBEmail db, User user) {// throws Exception
		System.out.println("Welcome " + user);
	}
	
	public static boolean newUser(DBEmail db) throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = teclado.next().toUpperCase();
		System.out.println("Enter your password");
		String pass = teclado.next();
		return db.newUser(name, pass);
	}
	
	public static int menu2() {
		int op2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menú");
		System.out.println(".....");
		System.out.println("1. Log In");
		System.out.println("2. Register");
		op2 = teclado.nextInt();
		return op2;
	}

}
