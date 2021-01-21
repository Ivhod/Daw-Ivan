package objetos;

public class AhorcadoObjetos {
	private char[] mascara;
	private int fallos;
	private String palabraOculta;
	
	public AhorcadoObjetos(String word) {
		this.palabraOculta = word.toUpperCase();
		this.mascara = new char [word.length()];
		for (int i=0;i<word.length();i++) {
			mascara[i] = '-';
		}
		this.fallos=0;
	}
	public String getMascara() {
		boolean esta=false;
		String s="";
		for (int i=0;i<mascara.length;i++) {
			
			
		}
	}

}
