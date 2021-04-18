package Modelo;

public class Dictionary {
   private String[]words = new String[] {"Hola","Caballo","Cortina","Hogar","perro", "mando","juntar", "portatil", "movil", "cajon"};
   
   public String getRandomWord() {
	   String palabra = words[(int) (Math.random() * 10)];
	   return palabra;
   }

}
