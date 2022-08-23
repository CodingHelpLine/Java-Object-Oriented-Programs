package threedshapes;

/**
 *
 * @author Programmer
 */
public class Sphere extends ThreeDShape {
    
    private double radius; 
    
    public Sphere() {
        this(0, 0, 1);
    }
    
    public Sphere(int x, int y, double radius) {
        super("Sphere", x, y); 
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    /**
     * Function to compute the Surface Area of a 3D Shape. 
     * 
     * @return surface area 
     */
    public double calcSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    } 
    
    @Override
    /**
     * Function to compute the Volume of the 3D shape. 
     * 
     * @return volume 
     */
    public double calcVolume() {
        return (3.0 / 4.0) * Math.PI * Math.pow(radius, 3); 
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
        output += String.format("%-20s %.2f%n", "SurfaceArea: ", this.calcSurfaceArea());
        output += String.format("%-20s %.2f%n", "Volume: ", this.calcVolume());
        
        return output; 
    }
    
    
}
