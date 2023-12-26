package entities;

public class Rectangle implements Shape {
	// Atributos
	private double width;
	private double height;
	
	// Método Construtor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// Métodos Getters e Setters
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	// Métodos 
	@Override
	public double area() {
		return width * height;
	}
}
