package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// Problema 2
		/*
		 * Vamos fazer um método que copia os elementos de uma lista para uma outra
		 * lista que pode ser mais genérica que a primeira.
		 */

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	}
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}

/*
 * Comentários
 * 
 * // Problema 1 /* Vamos fazer um método para retornar a soma das áreas de uma
 * lista de figuras.
 */

/*
 * Nota 1: soluções impróprias: public double totalArea(List<Shape> list) public
 * double totalArea(List<?> list)
 * 
 * Nota 2: não conseguiremos adicionar elementos na lista do método
 */

/*
 * List<Shape> myShapes = new ArrayList<>(); myShapes.add(new Rectangle(3.0,
 * 2.0)); myShapes.add(new Circle(2.0));
 * 
 * List<Circle> myCircles = new ArrayList<>(); myCircles.add(new Circle(2.0));
 * myCircles.add(new Circle(3.0));
 * 
 * System.out.println("Total area: " + totalArea(myShapes)); }
 * 
 * public static double totalArea(List<? extends Shape> list) { double sum =
 * 0.0; for (Shape s : list) { sum += s.area(); } return sum;
 * 
 * 
 * }
 * 
 * }
 */