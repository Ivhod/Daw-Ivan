package animelist;

import java.util.Scanner;

import objetosDB.User;

public class Testanimelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			animelist db = new animelist();
			int op;
			User user;
		} catch (Exception ex) {
			System.out.println("Red code You are NOT connected to EMAIL");
		}
	}
	public static int menu() {
		int op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Menú");
		System.out.println(".....");
		System.out.println("1. Iniciar Sesion");
		System.out.println("2. Registarse");
		op = teclado.nextInt();
		return op;
	}
	public static User login(animelist db) throws Exception {
		User u;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Iniciando Sesion: ");
		System.out.println("Introduce tu nombre");
		String name = teclado.next();
		System.out.println("Introduce tu contraseña");
		String pass = teclado.next();
		u = db.getUser(name, pass);
		return u;
	}
	public static void insideSystem(animelist db, User user) {// throws Exception
		System.out.println("Welcome " + user);
	}
	public static boolean newUser(animelist db) throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = teclado.next().toUpperCase();
		System.out.println("Enter your password");
		String pass = teclado.next();
		return db.newUser(name, pass);
	}

}
