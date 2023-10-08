// DJ Trost | CSD 405 | Assignment 11 | 7 October 2023
// Displays various figures allowing users to switch figures and their fill color

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TrostShapes extends Application {

    @Override
    public void start(Stage primaryStage) {        
        // Sets random color
        Color fillColor = new Color(Math.random(), Math.random(), Math.random(), 1.0);

        // Creates shape objects
        Circle circle = new Circle();
            circle.setRadius(50);
            circle.setStroke(fillColor);
            circle.setFill(null);

        Ellipse ellipse = new Ellipse();
            ellipse.setRadiusX(50);
            ellipse.setRadiusY(25);
            ellipse.setStroke(fillColor);
            ellipse.setFill(null);

        Rectangle rectangle = new Rectangle();
            rectangle.setWidth(100);
            rectangle.setHeight(50);
            rectangle.setStroke(fillColor);
            rectangle.setFill(null);

        // Creates Radio buttons to toggle which shape is displayed
        RadioButton rbCircle, rbEllipse, rbRectangle;
            rbCircle = new RadioButton("Circle");
            rbEllipse = new RadioButton("Ellipse");
            rbRectangle = new RadioButton("Rectangle");
        
        ToggleGroup shapes = new ToggleGroup();
            rbCircle.setToggleGroup(shapes);
            rbEllipse.setToggleGroup(shapes);
            rbRectangle.setToggleGroup(shapes);
        
        CheckBox ckFill;    // Creates checkbox to toggle fill
            ckFill = new CheckBox("Fill");
        
        Pane shapePane = new StackPane();   // Pane for shapes
            shapePane.setPrefSize(100, 100);
            StackPane.setAlignment(shapePane, Pos.CENTER);

        Pane rbPane = new VBox();   // Pane for radio buttons
            rbPane.getChildren().add(rbCircle);
            rbPane.getChildren().add(rbEllipse);
            rbPane.getChildren().add(rbRectangle);

        Pane checkPane = new VBox();;   // Pane for checkbox
            checkPane.getChildren().add(ckFill);

        BorderPane layout = new BorderPane();   // Base pane for components
            layout.setLeft(rbPane);
            layout.setCenter(shapePane);
            layout.setRight(checkPane);
        
        // Radio button functions
        rbCircle.setOnAction(e -> {
            shapePane.getChildren().clear();

            if (rbCircle.isSelected()) {
                shapePane.getChildren().add(circle);
            }
        });

        rbEllipse.setOnAction(e -> {
            shapePane.getChildren().clear(); 

            if (rbEllipse.isSelected()) {
                shapePane.getChildren().add(ellipse);
            }
        });

        rbRectangle.setOnAction(e -> {
            shapePane.getChildren().clear();

            if (rbRectangle.isSelected()) {
                shapePane.getChildren().add(rectangle);
            }
        });
        
        // Checkbox function
        ckFill.setOnAction(e -> {
            if (ckFill.isSelected()) {
                circle.setFill(fillColor);
                ellipse.setFill(fillColor);
                rectangle.setFill(fillColor);
            }
            else {
                circle.setFill(null);
                ellipse.setFill(null);
                rectangle.setFill(null);
            }
        });

        primaryStage.setTitle("Assignment 11 - Random Shapes");
        Scene scene1= new Scene(layout, 400, 250);
        primaryStage.setScene(scene1);
        
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
