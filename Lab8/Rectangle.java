public class Rectangle extends GeometricObject {
  private double width;
  private double height;
  private String temp;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }
  
  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }

  /**Overrides the equals method in Object*/
  @Override
  public boolean equals(Object obj)
  {
	  if(width == ((Rectangle)obj).getWidth() && height == ((Rectangle)obj).getHeight())
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
	temp = "Rectangle: Width: " + width + " Height: " + height + " Area: " + (width*height) + " Perimeter: " + (2*(width + height));
	return temp;
  }
  
  
}

