public class Square extends GeometricObject implements Colorable {
  private double width;
  private String temp;

    /** Construct a square with width and height */
  public Square(double width) {
    this.width = width;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*width;
  }
  
  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + width);
  }

  /**Overrides the equals method in Object*/
  @Override
  public boolean equals(Object obj)
  {
	  if(width == ((Square)obj).getWidth())
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  
  @Override
  public String toString()
  {
	temp = "Square: Width: " + width + " Area: " + (width*width) + " Perimeter: " + (2*(width + width));
	return temp;
  }
  
  public void howToColor()
  {
	  System.out.println("Colour all four sides.");
  }
  
}

