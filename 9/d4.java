package com.example.demo6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private double messageX = 50;
    private double messageY = 50;
    private Text message;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        message = new Text(messageX, messageY, "Welcome to Java");
        message.setFont(new Font(20));
        pane.getChildren().add(message);

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");
        buttonBox.getChildren().addAll(btnLeft, btnRight);

        ToggleGroup colorGroup = new ToggleGroup();
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        rbRed.setToggleGroup(colorGroup);
        rbGreen.setToggleGroup(colorGroup);
        rbBlue.setToggleGroup(colorGroup);

        HBox colorBox = new HBox(10);
        colorBox.setAlignment(Pos.CENTER);
        colorBox.getChildren().addAll(rbRed, rbGreen, rbBlue);

        btnLeft.setOnAction(e -> moveLeft());
        btnRight.setOnAction(e -> moveRight());
        rbRed.setOnAction(e -> message.setFill(Color.RED));
        rbGreen.setOnAction(e -> message.setFill(Color.GREEN));
        rbBlue.setOnAction(e -> message.setFill(Color.BLUE));

        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(buttonBox, colorBox);

        pane.getChildren().add(hbox);

        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveLeft() {
        messageX -= 10;
        message.setX(messageX);
    }

    private void moveRight() {
        messageX += 10;
        message.setX(messageX);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
