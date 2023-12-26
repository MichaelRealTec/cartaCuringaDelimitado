package entities;

public class Circle implements Shape{
	// Atributos
	private double radius;
	
	// Método construtor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	// Métodos Getters e Setters
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
