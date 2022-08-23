package shape;

/**
 * Base of all the Geometric Shapes
 * 
 * @author Programmer
 */
public abstract class Shape {
    
    // name
    private String name; 
    
    // x, y coordinates of Center
    private int x;
    private int y; 
    
    /**
     * Default Constructor
     */
    public Shape() {
        // Local constructor chaining
        this("", 0, 0);
    }
    
    /**
     * Instantiate Shape with given parameter values. 
     * 
     * @param name
     * @param x
     * @param y 
     */
    public Shape(String name, int x, int y) {
       this.name = name; 
       this.x = x; 
       this.y = y; 
    }
    
    /**
     * Get the name of the Shape
     * 
     * @return shape name 
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Set or update the name of the Shape. 
     * 
     * @param name of shape 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the X-coordinate of Center
     * 
     * @return x coordinate 
     */
    public int getX() {
        return x;
    }
    
    /**
     * Set or update the X-Coordinate
     * 
     * @param x 
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Get the y coordinate of shape center
     * 
     * @return y coordinate 
     */
    public int getY() {
        return y; 
    }
    
    /**
     * Set or update the y-coordinate
     * 
     * @param y coordinate 
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Get the String representation 
     *  or Human readable information of the object. 
     * 
     * @return string representation 
     */
    public String toString() {
        
        /*
          Shape Name:       Name of Shape
          Center:             (x, y) 
        
        */
        
        return String.format("%-20s %s%n", "Shape Name:", 
                    name) + 
               String.format("%-20s (%d, %d)%n", "Center:", 
                    x, y); 
    }
    
}
