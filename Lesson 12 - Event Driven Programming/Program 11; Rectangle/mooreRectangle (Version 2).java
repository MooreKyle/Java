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

        double width = 500;
        double height = 500;
        
        /* Create Rectangle & Properties - Coordinates: (x, y) & Measurements: (width, height)
        Width values for rectangles is (percentage * 10), where pecentage is width value.
        Multiplication by 10 was used to upscale graph.*/
        //Rectangle 1 & Properties
        Rectangle r1 = new Rectangle(width / 2.5, height / 2.5, 100, 75);
        r1.setFill(Color.TRANSPARENT);
        r1.setStroke(Color.BLACK);

        Pane pane = new Pane(r1);
        r1.setOnMouseDragged(a-> {
            r1.setX(a.getX() - r1.getWidth() / 2);
            r1.setY(a.getY() - r1.getHeight() / 2);
        });
        
        // Create a scene and place it in the stage
        //Affects size of GUI window opened
        primaryStage.setTitle("Drag the rectangle using your mouse"); // Set the stage title
        primaryStage.setScene(new Scene(pane, width, height));
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