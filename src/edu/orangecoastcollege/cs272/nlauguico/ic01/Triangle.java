package edu.orangecoastcollege.cs272.nlauguico.ic01;

import java.awt.Color;

/**
 * Triangle class (Derives from Shape2D class)
 * 
 * @author nlauguico
 *
 */
public class Triangle extends Shape2D 
{
	private int base, height;
	
	/**
	 * Constructor
	 * @param x
	 * @param y
	 * @param color
	 * @param base
	 * @param height
	 */
	public Triangle(int x, int y, Color color, int base, int height) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.base = base;
		this.height = height;
	}

	/**
	 * @return the base
	 */
	public int getBase() {
		return this.base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Calculates area of the triangle
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * this.base * this.height;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (base != other.base)
			return false;
		if (height != other.height)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int h = this.height; h > 0; --h) {
            for (int b = this.base; b > (h - 1); --b) {
                sb.append('*');
                sb.append(' ');
            }
            sb.append('\n');
        }
        sb.append("The area of this triangle is ");
        sb.append((int)calculateArea());
        sb.append(" square units.\n");
        String drawing = sb.toString();
        
        return drawing;
	}
}
