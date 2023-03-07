/*
 * Kyle Moore
 * Event Driven Programming
 * Tuesday, April 20, 2021
 * This program will display a Rectangle. You can point the mouse inside the Rectangle and drag (by keeping the mouse pressed) the rectangle anywhere. In this state, the mouse becomes the center of the rectangle.
 */

package mooreRectangle.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

//Class: mooreRectangle inherits Application
public class mooreRectangle extends Application {

    //Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {

        //Declarations
        double width = 500;
        double height = 500;
        
        // Create Rectangle & Properties - Coordinates: (x, y) & Measurements: (width, height)
        //Rectangle 1 & Properties
        Rectangle r1 = new Rectangle(width / 2.5, height / 2.5, 100, 75);
        r1.setFill(Color.TRANSPARENT);
        r1.setStroke(Color.BLACK);

        //Creates a new pane
        Pane pane = new Pane(r1);
        
        //Creates & Registers Event Handler - Defines a function to be called when a mouse button is pressed on this Node and then dragged.
        r1.setOnMouseDragged(a-> {
            //Coordinates: (x, y) - Affects coordinate position of mouse cursor upon initiating state of dragging
            r1.setX(a.getX() - r1.getWidth() / 2); //Allows dragging on x-axis (left & right)
            r1.setY(a.getY() - r1.getHeight() / 2); //Allows dragging on y-axis (up & down)
        });
        
        // Create a scene and place it in the stage
        primaryStage.setScene(new Scene(pane, width, height)); // Affects size of GUI window opened
        primaryStage.setTitle("Drag the rectangle using your mouse"); // Set the stage title
        primaryStage.show(); // Display the stage
    }
    
    /**
    * The main method is only needed for the IDE with limited
    * JavaFX support. Not needed for running from the command line.
    */
    //main
    public static void main(String[] args) {
        Application.launch(args);
    }
}