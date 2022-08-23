package twodshapes;

/**
 *
 * @author Programmer
 */
public class Triangle extends TwoDShape {
    
    private int sideA;
    private int sideB;
    private int sideC;
    private double height;
    
    public Triangle() {
        this(0, 0, 1, 1, 1);
    }
    
    public Triangle(int x, int y, int sideA, int sideB, int sideC) {
        super("Triangle", x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        
        // Calcualte 
       calcHeight();
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    
    /**
     * Function to calculate the Perimeter of a 2D Shape object
     * 
     * @return perimeter of the shape.  
     */
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    } 
    
    /**
     * Function to calculate the Perimeter of a 2D Shape Object. 
     * 
     * @return area of the shape.  
     */
    public double calcArea() {
        // PI * R^2
        return (height * sideB) / 2; 
    }
    
    /**
     * Calculate height from a and b sides. 
     */
    public void calcHeight() {
         height = (2.0 * sideA) / sideB; 
    }
    
    @Override
    /**
     * String representation. 
     * 
     * @return String representation.
     */
    public String toString() {
        String output = super.toString();
        output += String.format("%-20s %d%n", "SideA: ", sideA);
        
        // base
        output += String.format("%-20s %d%n", "SideB: ", sideB);
        
        // Height
        
        output += String.format("%-20s %d%n", "SideB: ", sideC);
        output += String.format("%-20s %.2f%n", "Height: ", height);
        
        
        output += String.format("%-20s %.2f%n", "Area: ", this.calcArea());
        output += String.format("%-20s %.2f%n", "Circumference: ", this.calcPerimeter());
        
        return output; 
    }
    
    
}
