package threedshapes;

import shape.Shape;

/**
 *
 * @author Programmer
 */
public abstract class ThreeDShape extends Shape {
    
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
