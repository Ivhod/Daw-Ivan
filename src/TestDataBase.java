package databases;

import java.util.Scanner;

import objetosDB.User;

public class TestDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DBEmail db= new DBEmail();
			//System.out.println("OK.You are connected to EMAIL");
			int op;
			User user;
			do {
				op =menu();
				switch (op) {
				case 1: user = login(db);
					if (user != null) 
						insideSystem(db,user);
						else
							System.out.println("You have to Register");
						break;
					
				}
				
			}while(op!=5);
			User u= db.getUser("PEPE", "1234");
			if (u==null)
				System.out.println("No esta");
			else
				System.out.println(u);
		}
		catch(Exception ex) {
			System.out.println("Red Code Your are NOT connected to EMAIL");
		}
	}
	public static int menu() {
		int op;
			Scanner input=new Scanner(System.in);
			System.out.println("Menu");
			System.out.println(".......");
			System.out.println("1.Login");
			System.out.println("2.Register");
			op = input.nextInt();
		return op;
	}
	public static User login(DBEmail db) throws Exception {
		User u;
		Scanner input=new Scanner(System.in);
		System.out.println("Login");
		System.out.println("Enter you Name");
		String name= input.next();
		
		System.out.println("Enter you Password");
		String pass= input.next();
		u=db.getUser(name, pass);
		
		return u;
		
	}
	public static void insideSystem(DBEmail db, User user){
		System.out.println("Welcome" +user);
	}
}
