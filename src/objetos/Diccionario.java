package objetos;
//La palabra en ingles para elegirla
//Si vuelvo a meter la misma palabra que no cuente como fallo, guardar la palabra
public class Diccionario {
	private String[] word ={"Hola","Caballo","Cortina","Hogar"};
	
	public String getRandom() {
		int i = (int)(Math.random()*word.length);
		return word[i];
	}
	
}
