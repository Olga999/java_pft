package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		Point point1 = new Point(0, 0);
		Point point2 = new Point(3, 4);
		
		System.out.println("Расстояние между двумя точками = " + distance(point1,point2));
	}

	public static double distance(Point point1, Point point2){
		return Math.sqrt( Math.pow(point2.x-point1.x, 2) + Math.pow(point2.y-point1.y, 2) );
	}
}