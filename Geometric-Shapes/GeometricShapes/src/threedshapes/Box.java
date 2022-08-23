package threedshapes;

/**
 * Box class. 
 * 
 * @author Programmer
 */
public class Box extends ThreeDShape {
    
    private int length; 
    private int width; 
    private int height; 
    
    public Box() {
        this(0, 0, 1, 1, 1);
    }
    
    public Box(int x, int y, int length, int width, int height) {
        super("Box", x, y);
        this.length = length; 
        this.width = width;
        this.height = height; 
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    /**
     * Function to compute the Surface Area of a 3D Shape. 
     * 
     * @return surface area 
     */
    public double calcSurfaceArea() {
        return  2 * (length * width) + 
                2 * (length * height) + 
                2 * (width * height);
    } 
    
    @Override
    /**
     * Function to compute the Volume of the 3D shape. 
     * 
     * @return volume 
     */
    public double calcVolume() {
        return length * width * height; 
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
        
        // width
        output += String.format("%-20s %d%n", "Width: ", width);
        
        // Height
        output += String.format("%-20s %d%n", "Height: ", height);
        
        
        output += String.format("%-20s %.2f%n", "SurfaceArea: ", this.calcSurfaceArea());
        output += String.format("%-20s %.2f%n", "Volume: ", this.calcVolume());
        
        return output; 
    }
    
}
