/*
 * Kyle Moore
 * JavaFX
 * Thursday, April 8, 2021
 * This program will display a Graphical User Interface (GUI) color-coded Bar Chart which displays the percentages of an overall grade. This includes Projects, Quizzes, Midterm Exams, and a Final Exam.
 */

package mooreFX.java;

import javafx.application.Application; 
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

//Class: mooreFX inherits Application
public class mooreFX extends Application {
    
    //Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        
        /* Create Rectangles & Properties - Coordinates: (x, y) & Measurements: (width, height)
        Width values for rectangles is (percentage * 10), where pecentage is width value.
        Multiplication by 10 was used to upscale graph.*/
        //Rectangle 1 & Properties
        Rectangle r1 = new Rectangle(25, 10, 200, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.RED);
        
        //Rectangle 2 & Properties
        Rectangle r2 = new Rectangle(25, 50, 100, 30); 
        r2.setStroke(Color.BLACK);
        r2.setFill(Color.BLUE);
        
        //Rectangle 3 & Properties
        Rectangle r3 = new Rectangle(25, 90, 300, 30);
        r3.setStroke(Color.BLACK);
        r3.setFill(Color.GREEN);
        
        //Rectangle 4 & Properties
        Rectangle r4 = new Rectangle(25, 130, 400, 30);
        r4.setStroke(Color.BLACK);
        r4.setFill(Color.ORANGE);
        
        //Constructors: Create Text Objects for Nodes
        Text t1 = new Text();
        Text t2 = new Text();
        Text t3 = new Text();
        Text t4 = new Text();

        // Create a group and add nodes to the group
        Group group = new Group();
        //Displays Categories for Bar Chart
        group.getChildren().addAll(new Text(-30, 27, "Projects"), r1, 
            new Text(-30, 67, "Quizzes"), r2, 
            new Text(-70, 107, "Midterm Exams"), r3, 
            new Text(-43, 147, "Final Exam"), r4,
            
            //Shows Percentage Values within Bars
            new Text(190, 29, "20%"), t1,
            new Text(90, 69, "10%"), t2,
            new Text(290, 109, "30%"), t3,
            new Text(390, 149, "40%"), t4);

        // Create a scene and place it in the stage
        //Affects size of GUI window opened
        Scene scene = new Scene(new BorderPane(group), 625, 375); //Original values were multiplied by 2.5 here
        primaryStage.setTitle("Percentages of Overall Grade"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
  
    /**
    * The main method is only needed for the IDE with limited
    * JavaFX support. Not needed for running from the command line.
    */
    //main
    public static void main(String[] args) {
        launch(args);
    }
}
