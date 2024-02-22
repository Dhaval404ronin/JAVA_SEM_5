package com.example.demo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private Circle circle;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);

        circle = new Circle(200, 200, 50);

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
            }
        });

        pane.getChildren().add(circle);
        primaryStage.setScene(scene);
        primaryStage.show();
        circle.requestFocus();
    }
}
