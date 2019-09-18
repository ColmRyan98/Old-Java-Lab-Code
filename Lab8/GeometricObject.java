public abstract class GeometricObject implements Comparable<GeometricObject> 
{
  protected String color;
  protected double weight;

  // Default construct
  protected GeometricObject() {
    color = "white";
    weight = 1.0;
  }

  // Construct a geometric object
  protected GeometricObject(String color, double weight) {
    this.color = color;
    this.weight = weight;
  }
  
  public int compareTo(GeometricObject o)
  {
	  if(this.getArea() == o.getArea())
	  {
		  return 0;
	  }
	  else if (this.getArea() > o.getArea())
	  {
		  return 1;
	  }
	  else 
	  {
		  return -1;
	  }
  }
  
  // Getter method for color
  public String getColor() {
    return color;
  }

  // Setter method for color
  public void setColor(String color) {
    this.color = color;
  }

  // Getter method for weight
  public double getWeight() {
    return weight;
  }

  // Setter method for weight
  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Method to find larger of two objects
  public static GeometricObject max(GeometricObject o1, GeometricObject o2)
  {
	  if(o1.compareTo(o2) == 1)
	  {
		  return o1;
	  }
	  else 
	  {
		  return o2;
	  }
  }
 
  
  // Abstract method
  public abstract double getArea();

  // Abstract method
  public abstract double getPerimeter();
  
 
}
