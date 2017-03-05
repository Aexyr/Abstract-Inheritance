package edu.orangecoastcollege.cs272.nlauguico.ic01;

import java.awt.Color;

/**
 * Shape2D class (Base class)
 * 
 * @author nlauguico
 *
 */
public abstract class Shape2D
{
    protected int x, y;
    protected Color color;
    
    
    /**
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}


	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}


	/**
	 * @return the color
	 */
	public Color getColor() {
		return this.color;
	}

	
	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}


	abstract public double calculateArea();
}
