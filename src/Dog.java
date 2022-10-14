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
    

    /* Assign values to all the instance variables in the constructor */
    public Dog(PApplet mySketch, int screenWidth, int screenHeight) {
        this.mySketch = mySketch;
        img = mySketch.loadImage("assets/dog.png");
        x =  mySketch.random(screenWidth - img.width);
        y =  mySketch.random(screenHeight - img.height);
    }

    /* Draws the dog */
    public void draw() {
        mySketch.image(img, x, y, img.width, img.height);
    }

    /* Test to see of the x and y location parameters are inside the dog's boundaries */
    /* returns true if x,y is inside the dog, otherwise returns false.
     * Note: y increases going down - weird but true!
     */
    public boolean isSelected(int x, int y) {
        if(rightEdge() >= x && leftEdge() <= x){
            if(topEdge() >= y && bottomEdge() <= y);
            return true;
        }
    
    return false;
}

    /* Returns the location of the right edge of the dog object */
    /* Call this is your isSelected method to tell you the right edge of the dog.
     * To find the width of the image, use "theNameOfYourPImageVariable.width"
     */
    private float rightEdge(){
        float rightEdge = x + img.width;
        return rightEdge;
    }
    /* Returns the location of the left edge of the dog object */
    /* Call this is your isSelected method to tell you the left edge of the dog */
    private float leftEdge(){
        float leftEdge = x;
        return leftEdge;
        
        
    }
    /* Returns the location of the top edge of the dog object */
    /* Call this is your isSelected method to tell you the top edge of the dog. */
    private float topEdge(){
        float topEdge = y;
        return topEdge; 
    }
    /* Returns the location of the top edge of the dog object */
    /* Call this is your isSelected method to tell you the bottom edge of the dog.
     * To find the height of the image, use "theNameOfYourPImageVariable.height
     */
    private float bottomEdge(){
        float bottomEdge = y + img.height;
        return bottomEdge; 
    }
}
