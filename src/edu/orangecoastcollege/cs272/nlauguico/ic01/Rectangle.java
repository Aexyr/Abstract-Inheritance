package edu.orangecoastcollege.cs272.nlauguico.ic01;

import java.awt.Color;

/**
 * Rectangle class (Derives from Shape2D class)
 * 
 * @author nlauguico
 *
 */
public class Rectangle extends Shape2D
{
    private int width, height;
    
    /**
     * Constructor
     * @param x
     * @param y
     * @param color
     * @param width
     * @param height
     */
    public Rectangle(int x, int y, Color color, int width, int height) {
		this.x = x;
		this.y = y;
		this.color = color;
        this.width = width;
        this.height = height;
    }
    
    /**
	 * @return the width
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
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
	 * Calculates the area of rectangle
	 */
	@Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return this.width * this.height;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        if (height != other.height) return false;
        if (width != other.width) return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int h = 1; h <= this.height; ++h) {
            for (int w = 1; w <= this.width; ++w) {
                sb.append('*');
                sb.append(' ');
            }
            sb.append('\n');
        }
        sb.append("The area of this rectangle is ");
        sb.append((int)calculateArea());
        sb.append(" square units.\n");
        
        String drawing = sb.toString();
        return drawing;
    }

}
