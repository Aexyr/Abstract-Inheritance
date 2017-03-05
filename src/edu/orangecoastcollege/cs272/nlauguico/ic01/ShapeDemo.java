package edu.orangecoastcollege.cs272.nlauguico.ic01;

import java.awt.Color;
import java.util.ArrayList;

/**
 * ShapeDemo creates a demo of the classes Shape2D, Rectangle, Triangle, Parallelogram.
 * 
 * @author nlauguico
 *
 */
public class ShapeDemo {

	/**
	 * Starts the demo.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape2D> shapes = new ArrayList<Shape2D>();
		
		shapes.add(new Rectangle(1,1,Color.red,9,10));
		shapes.add(new Triangle(2,2,Color.black,10,10));
		shapes.add(new Parallelogram(3,3,Color.white,25,5));
		
		for (Shape2D shape : shapes) {
			System.out.println(shape.toString());
		}
	}
}