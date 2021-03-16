package examen2evaluacion;

public class Complejo {
	private double real;
	private double imag;
	
	public Complejo() {
		
	}
	public Complejo(double real, double imag) {
		this.real= real;
		this.imag=imag;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public Complejo sumar(Complejo c) {
		Complejo aux = new Complejo();
		aux.real = real + c.real;
		aux.imag = imag + c.imag;
		return aux;
				
	}	
	public Complejo producto(Complejo c) {
		Complejo aux = new Complejo();
		aux.real = real * c.real - imag * c.imag;
		aux.imag = imag * c.imag + imag * c.real;
		return aux;
		
	}
	public Complejo cociente(Complejo c) {
		Complejo aux = new Complejo();
		aux.real = (real * c.real + imag * c.imag)/(c.real*c.real+c.imag+c.imag);
		aux.imag = (imag * c.real - real * c.imag)/(c.real * c.real + c.imag * c.imag);                           
        return aux;
		
	}
	public String toString() {
        return "(" + real + ", " + imag + ")";
    }
	public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (this.real != other.real) {
            return false;
        }
        if (this.imag != other.imag) {
            return false;
        }
        return true;
    }
	
}
