package threedshapes;

import shape.Shape;

/**
 *
 * @author Programmer
 */
public abstract class ThreeDShape extends Shape {
    
    /**
     * Default constructor
     */
    public ThreeDShape() {
       this("3D Shape", 0, 0);  
    }
    
    /**
     * Parameter constructor
     * 
     * @param name
     * @param x
     * @param y 
     */
    public ThreeDShape(String name, int x, int y) {
        super(name, x, y);
    }
    
    /**
     * Function to compute the Surface Area of a 3D Shape. 
     * 
     * @return surface area 
     */
    public abstract double calcSurfaceArea(); 
    
    /**
     * Function to compute the Volume of the 3D shape. 
     * 
     * @return volume 
     */
    public abstract double calcVolume();

}
