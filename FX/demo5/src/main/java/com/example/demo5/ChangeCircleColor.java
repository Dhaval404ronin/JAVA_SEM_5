package com.example.demo5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeCircleColor extends Application {

    private Circle circle;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        circle = new Circle(150, 150, 50, Color.BLUE);
        pane.getChildren().add(circle);

        circle.setOnMousePressed(e -> circle.setFill(Color.RED));
        circle.setOnMouseReleased(e -> circle.setFill(Color.BLUE));

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
