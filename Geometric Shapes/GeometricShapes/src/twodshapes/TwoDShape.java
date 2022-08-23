package twodshapes;

import shape.Shape;

/**
 *
 * @author Programmer
 */
public abstract class TwoDShape extends Shape {

    /**
     * Default constructor
     */
    public TwoDShape() {
        
        // we have parameter constructor 
        // that takes name and center as parameter
        // local chain - instead of super class
        super("2D Shape", 0, 0);
        
    }
    
    /**
     * Parameter constructor 
     * 
     * @param name
     * @param x
     * @param y 
     */
    public TwoDShape(String name, int x, int y) {
       super(name, x, y); 
    }
    
    
    /**
     * Function to calculate the Perimeter of a 2D Shape object
     * 
     * @return perimeter of the shape.  
     */
    public abstract double calcPerimeter(); 
    
    /**
     * Function to calculate the Perimeter of a 2D Shape Object. 
     * 
     * @return area of the shape.  
     */
    public abstract double calcArea();
    
    @Override
    /**
     * String representation. 
     * 
     * @return String representation.
     */
    public String toString() {
        return super.toString();
    }
}
