package twodshapes;

/**
 *
 * @author Programmer
 */
public class Square extends TwoDShape {
    private int side;
    
    public Square() {
        this(0, 0, 1);
    }
    
    public Square(int x, int y, int side) {
        super("Square", x, y);
        this.side = side; 
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    /**
     * Function to calculate the Perimeter of a 2D Shape object
     * 
     * @return perimeter of the shape.  
     */
    public double calcPerimeter() {
        return 4 * side;
    } 
    
    /**
     * Function to calculate the Perimeter of a 2D Shape Object. 
     * 
     * @return area of the shape.  
     */
    public double calcArea() {
        // PI * R^2
        return side * side; 
    }
    
    @Override
    /**
     * String representation. 
     * 
     * @return String representation.
     */
    public String toString() {
        String output = super.toString();
        output += String.format("%-20s %d%n", "Side: ", side);
        output += String.format("%-20s %.2f%n", "Area: ", this.calcArea());
        output += String.format("%-20s %.2f%n", "Circumference: ", this.calcPerimeter());
        
        return output; 
    }
}
