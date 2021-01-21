package objetos;

import java.util.Random;

public class Password {
	private String password;
	private int size;
	
	public  Password() {
		this.size=8;
		generatePassword();
	}
	public Password(int size) {
		this.size = size;
		generatePassword();
	}
	public void generatePassword() {
		this.password="";
		for (int i =0; i<this.size;i++) {
			Random r= new Random();
			int random = r.nextInt(3)+1;
			int max=0;
			int min = 0;
			
			switch(random) {
			case 1: max = 'Z';
					min = 'A';
					break;
			case 2: max= 'Z';
					min= 'A';
					break;
			case 3: max ='9';
					min='0';
					break;
			}
			char l =(char)(min + (int)(Math.random()*(max-min)+1));
			this.password+=1;
		}
	}
	public String getPassword() {
		return password;
	}
	public boolean isStrong() {
		boolean Strong=false;
		int c1=0;
		int c2=0;
		int c3=0;
		for (int i = 0; i<this.size; i++) {
			char c = this.password.charAt(i);
			if (c>='0' && c<='9') 
				c1++;
			else if (c>='A' && c<='Z')
				c2++;
			else
				c3++;
				
		}
		Strong = (c1>=5)&&(c2>=2) && (c3>=1);
		return Strong;
	}
	public String getHiddenPassword() {
		String s="";
		for (int i=0;i<this.size;i++) {
			s+="*";
			
		}
		return s;
	}
}
