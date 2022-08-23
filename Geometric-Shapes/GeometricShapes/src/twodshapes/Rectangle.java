package twodshapes;

/**
 *
 * @author Programmer
 */
public class Rectangle extends TwoDShape {
    private int width; 
    private int length; 
    
    public Rectangle() {
       this(0, 0, 1, 1); 
    }
    
    /**
     * Parameter constructor. 
     * 
     * @param x
     * @param y
     * @param width
     * @param length 
     */
    public Rectangle(int x, int y, int width, int length) {
        super("Rectangle", x, y); 
        this.width = width; 
        this.length = length; 
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    /**
     * Function to calculate the Perimeter of a 2D Shape object
     * 
     * @return perimeter of the shape.  
     */
    public double calcPerimeter() {
        return 2 * (width + length);
    } 
    
    /**
     * Function to calculate the Perimeter of a 2D Shape Object. 
     * 
     * @return area of the shape.  
     */
    public double calcArea() {
        // PI * R^2
        return length * width; 
    }
    
    @Override
    /**
     * String representation. 
     * 
     * @return String representation.
     */
    public String toString() {
        String output = super.toString();
        output += String.format("%-20s %d%n", "Length: ", length);
        output += String.format("%-20s %d%n", "Width: ", width);
        output += String.format("%-20s %.2f%n", "Area: ", this.calcArea());
        output += String.format("%-20s %.2f%n", "Circumference: ", this.calcPerimeter());
        
        return output; 
    }
}
