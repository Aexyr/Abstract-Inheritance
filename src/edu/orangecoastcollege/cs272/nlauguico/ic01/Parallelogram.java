package edu.orangecoastcollege.cs272.nlauguico.ic01;

import java.awt.Color;

/**
 * Parallelogram class (Derives from Shape2D class)
 * 
 * @author nlauguico
 *
 */
public class Parallelogram extends Shape2D 
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
	public Parallelogram(int x, int y, Color color, int base, int height) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.base = base;
		this.height = height;
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
	 * Calculates the area of the parallelogram
	 */
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.base * this.height;
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
		Parallelogram other = (Parallelogram) obj;
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
	    for (int h = 0; h < this.height; ++h) {
	        for (int b = 0; b < (this.base + h); ++b) {
	        	sb.append((b < h)? ' ' : '*');
	        }
	        sb.append('\n');
	    }
	    sb.append("The area of this Parallelogram is ");
	    sb.append((int)calculateArea());
	    sb.append(" square units.\n");
	    
	    String drawing = sb.toString();
	    return drawing;
	}
}
