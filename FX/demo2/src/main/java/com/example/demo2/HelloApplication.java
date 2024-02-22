package com.example.demo2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private static final double DEFAULT_WIDTH = 400;
    private static final double DEFAULT_HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, DEFAULT_WIDTH, DEFAULT_HEIGHT, true);
        scene.setFill(Color.WHITE);

        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateZ(-800);
        scene.setCamera(camera);

        Box rectanguloid = new Box(DEFAULT_WIDTH / 4, DEFAULT_HEIGHT / 4, DEFAULT_WIDTH / 4);
        rectanguloid.setTranslateX(DEFAULT_WIDTH / 2);
        rectanguloid.setTranslateY(DEFAULT_HEIGHT / 2);

        root.getChildren().add(rectanguloid);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectanguloid");
        primaryStage.show();

        // Bind the size of the rectanguloid to the scene width and height
        rectanguloid.widthProperty().bind(scene.widthProperty().divide(4));
        rectanguloid.heightProperty().bind(scene.heightProperty().divide(4));
        rectanguloid.depthProperty().bind(scene.widthProperty().divide(4));

        // Rotate the rectanguloid
        Rotate rotateX = new Rotate(30, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(30, Rotate.Y_AXIS);
        rectanguloid.getTransforms().addAll(rotateX, rotateY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
