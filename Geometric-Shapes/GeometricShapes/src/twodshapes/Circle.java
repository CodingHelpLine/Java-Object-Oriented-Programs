package twodshapes;

/**
 * Circle
 * 
 * @author Programmer
 */
public class Circle extends TwoDShape {
    
    private double radius; 
    
    /**
     * Default constructor
     */
    public Circle() {
        this("Circle", 0, 0, 1);
    }
    
    /**
     * Parameter constructor
     * 
     * @param name
     * @param x
     * @param y
     * @param radius 
     */
    public Circle(String name, int x, int y, double radius) {
       super(name, x, y); 
       this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    /**
     * Set or update Radius.
     * 
     * @param radius 
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Function to calculate the Perimeter of a 2D Shape object
     * 
     * @return perimeter of the shape.  
     */
    public double calcPerimeter() {
        return Math.PI * 2 * radius;
    } 
    
    /**
     * Function to calculate the Perimeter of a 2D Shape Object. 
     * 
     * @return area of the shape.  
     */
    public double calcArea() {
        // PI * R^2
        return Math.PI * Math.pow(this.radius, 2); 
    }
    
    @Override
    /**
     * String representation. 
     * 
     * @return String representation.
     */
    public String toString() {
        String output = super.toString();
        output += String.format("%-20s %.2f%n", "Radius: ", radius);
        output += String.format("%-20s %.2f%n", "Area: ", this.calcArea());
        output += String.format("%-20s %.2f%n", "Circumference: ", this.calcPerimeter());
        
        return output; 
    }
}
