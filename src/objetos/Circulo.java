package objetos;

public class Circulo {
	private double radius;
	private String color;

	
	public Circulo(double r, String c) {
		radius = r;
		color = c;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

}