import processing.core.PApplet;
/**
 * Represents a sketch(canvas) to draw on.  This class extends PApplet and
 * therefore has access to all Processing methods.
 * @author Gray Prescott
 * @version 1.0
 * @since 1.0
 */
public class MySketch extends PApplet {
    private Dog dog;
    //TODO: create a private dog object variable

    public void settings(){
        size(500,500);
        //TODO:  set the size of the canvas
        //Once you set the canvas size, processing automatically stores the
        //dimensions of the canvas in variables you can access. 
        //https://processing.org/reference/size_.html
    }
    
    /* This method runs once */
    public void setup() {
        dog = new Dog(this, width, height);
        //TODO: assign the dog object variable to a new Dog object.
        //pass in this sketch (so the dog can draw on it) 
        //along with the width and height of the canvas.
    }

    /* This method over and over again, repainting the background and
     * drawing the dog in an endless cycle of dog drawing.
     */
    public void draw(){
        background(255);
        dog.draw();
        
        //TODO: set the color of the canvas' background.
        //TODO: draw the dog
    }

    /* This methos is called every time the mouse is pressed */
    public void mousePressed() {
        if(dog.isSelected(mouseX, mouseY)){
            dog.draw();
        // TODO: call the dog object's method that figures out of the mouse was pressed on the dog object.
        // Passing in the mouse's x and y position so it can do its job.

        // TODO: if the mouse if on the dog, move the dog. 
        // You might create a new dog object at a random location or move the current dog to a different location.
        // Note: when you update the dog object variable to reference a different object, Java
        // automatically gets rid of the old object. Isn't the nice of Java!   
        // It's called garbage collection.
        }
        }    
    }



