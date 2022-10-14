import processing.core.PApplet;
import processing.core.PImage;
/**
 * Represents a dog.  This class DOES NOT extends PApplet since a Dog is not a skectch(canvas)
 * To use Processing's methods in this class, you must pass the sketch object into its constructor
 * and then assign it to the instance variable (mySketch).
 * @author Gray Prescott
 * @version 1.0
 * @since 1.0
 */
public class Dog {

    private PApplet mySketch; 
    private PImage img;         
    private float x;
    private float y;
    private float size;
    

    /* Assign values to all the instance variables in the constructor */
    public Dog(PApplet mySketch, int screenWidth, int screenHeight) {
        this.mySketch = mySketch;
        img = mySketch.loadImage("assets/dog.png");
        x =  mySketch.random(screenWidth - size) + size;
        y =  mySketch.random(screenHeight - size) + size;
        size = 50;
    }

    /* Draws the dog */
    public void draw() {
        mySketch.image(img, x, y, size, size);
    }

    /* Test to see of the x and y location parameters are inside the dog's boundaries */
    /* returns true if x,y is inside the dog, otherwise returns false.
     * Note: y increases going down - weird but true!
     */
    public boolean isSelected(int x, int y) {
        boolean isSelected = (rightEdge() > x && leftEdge() < x) && (topEdge() > y && bottomEdge() < y);
        return isSelected;
    }

    /* Returns the location of the right edge of the dog object */
    /* Call this is your isSelected method to tell you the right edge of the dog.
     * To find the width of the image, use "theNameOfYourPImageVariable.width"
     */
    private float rightEdge(){
        float rightEdge = x + size;
        return rightEdge;
        //TODO: return the location of the right edge of the dog
    }
    /* Returns the location of the left edge of the dog object */
    /* Call this is your isSelected method to tell you the left edge of the dog */
    private float leftEdge(){
        float leftEdge = x;
        return leftEdge;
        //TODO: return the location of the left edge of the dog
        
    }
    /* Returns the location of the top edge of the dog object */
    /* Call this is your isSelected method to tell you the top edge of the dog. */
    private float topEdge(){
        float topEdge = y;
        return topEdge;
        //TODO: return the location of the top edge of the dog   
    }
    /* Returns the location of the top edge of the dog object */
    /* Call this is your isSelected method to tell you the bottom edge of the dog.
     * To find the height of the image, use "theNameOfYourPImageVariable.height
     */
    private float bottomEdge(){
        float bottomEdge = y + size;
        return bottomEdge;
        //TODO: return the location of the bottom edge of the dog  
    }
}
