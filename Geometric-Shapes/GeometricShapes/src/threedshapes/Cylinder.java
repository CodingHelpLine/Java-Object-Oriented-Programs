package threedshapes;

/**
 *
 * @author Programmer
 */
public class Cylinder extends ThreeDShape {
    private double radius;
    private double height; 
    
    public Cylinder() {
        this(0, 0, 1, 1);
    }
    
    public Cylinder(int x, int y, double height, double radius) {
        super("Cyliner", x, y); 
        this.height = height;
        this.radius = radius; 
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
        @Override
    /**
     * Function to compute the Surface Area of a 3D Shape. 
     * 
     * @return surface area 
     */
    public double calcSurfaceArea() {
        return (2 * Math.PI * radius * height) +
                (2 * Math.PI * Math.pow(radius, 2));
    } 
    
    @Override
    /**
     * Function to compute the Volume of the 3D shape. 
     * 
     * @return volume 
     */
    public double calcVolume() {
        return Math.PI * Math.pow(radius, 2) * height; 
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
        output += String.format("%-20s %.2f%n", "Height: ", height);
        output += String.format("%-20s %.2f%n", "SurfaceArea: ", this.calcSurfaceArea());
        output += String.format("%-20s %.2f%n", "Volume: ", this.calcVolume());
        
        return output; 
    }
    
}
