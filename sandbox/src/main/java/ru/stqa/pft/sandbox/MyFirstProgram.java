package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		Point point1 = new Point(0, 0);
		Point point2 = new Point(3, 4);

		System.out.println("Расстояние между двумя точками = " + point1.distance());

	}


}