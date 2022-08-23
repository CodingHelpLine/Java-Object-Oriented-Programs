import shape.*;
import threedshapes.*;
import twodshapes.*;

/**
 * @author Programmer
 */
public class GeometricShapes {
    
    public static void main(String [] args) {
        
        // let declare array of shapes
        Shape shapes [] = new Shape[8]; 

        // add circle
        shapes[0] = new Circle("Circle", 0, 0, 3); 
        shapes[1] = new Rectangle(0, 0, 2, 3); 
        shapes[2] = new Square(0, 0, 3);
        shapes[3] = new Triangle(0, 0, 2, 3, 4);
        
        for(Shape shape: shapes) {
            if(shape != null) {
                System.out.println(shape); 
                System.out.println();
            }
        }
    }    
}
