package threedshapes;

/**
 *
 * @author Programmer
 */
public class Cube extends ThreeDShape {
    private int side;
    
    public Cube() {
        this(0, 0, 1);
    }
    
    public Cube(int x, int y, int side) {
        super("Cube", x, y);
        this.side = side; 
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    @Override
    /**
     * Function to compute the Surface Area of a 3D Shape. 
     * 
     * @return surface area 
     */
    public double calcSurfaceArea() {
        return  6 * (side * side);
    } 
    
    @Override
    /**
     * Function to compute the Volume of the 3D shape. 
     * 
     * @return volume 
     */
    public double calcVolume() {
        return Math.pow(side, 3); 
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
        output += String.format("%-20s %.2f%n", "SurfaceArea: ", this.calcSurfaceArea());
        output += String.format("%-20s %.2f%n", "Volume: ", this.calcVolume());
        
        return output; 
    }
}
