package objetos;

public class IBM {
	private double altura;
	private double peso;
	
	public IBM(double peso,double altura) {
		this.peso = peso;
		this.altura= altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIMC() {
		double imc = peso/Math.pow(altura, 2);
		return imc;
	}
	public String report() {
		double imc = getIMC();
		if (imc < 18.5)
			return "Por debajo de lo normal";
		if(imc < 25)
			return "Peso normal";
		if (imc < 30)
			return "Peso superior a lo normal";
		return "Gordo";
		
	}
}
