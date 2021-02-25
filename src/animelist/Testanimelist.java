package animelist;

import java.util.Scanner;

import objetosDB.User;

public class Testanimelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			animelist db = new animelist();
			int op;
			int op1;
			User user;
			do {
				op = menu();
				switch (op) {
				case 1:
					user = login(db);
					if (user != null) {
						insideSystem(db, user);
					} else
						System.out.println("Tu estas registrado.");
					do{
						op1=menu2();
						switch (op1) {
						case 1: 
							System.out.println("Estos son tus Animes para ver:");
							for(int i = 0; i < db.getAnime(user).size();i++) {
							System.out.println(db.getAnime(user).get(i));
							}
						break;
						case 2: 
							System.out.println("Nombre del anime");
							String name = input.nextLine();
							System.out.println("Genero");
							String Genero = input.nextLine();
							 db.newAnime(name,Genero);
							break;
						}
					}while(op1!=3);
					break;					
				case 2: 
					boolean inserted = newUser(db);
					if(inserted)
						System.out.println("Usuario registrado con éxito. Ve a logearte");
					else
						System.out.println("Problemas al registrarse");
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
		System.out.println("MyAnimeList");
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
		System.out.println("Bienvenido " + user);
		System.out.println("----------------------");
		//System.out.println("Estos son tus animes para ver:");
	}
	public static boolean newUser(animelist db) throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String name = teclado.next().toUpperCase();
		System.out.println("Introduce tu contraseña");
		String pass = teclado.next();
		return db.newUser(name, pass);
	}
	public static int menu2() {
		int op1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("MyAnimeList");
		System.out.println("..............");
		System.out.println("1. Ver los Animes.");
		System.out.println("2. Introducir Nuevos Animes.");
		System.out.println("3. Salir.");
		op1 = teclado.nextInt();
		return op1;
	}

}
