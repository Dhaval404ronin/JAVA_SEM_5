package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class demo extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(10); // Horizontal spacing between texts
        hbox.setPadding(new Insets(10));

        String[] texts = {"Text 1", "Text 2", "Text 3", "Text 4", "Text 5"};

        for (String text : texts) {
            Text t = new Text(text);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 22));
            t.setFill(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256),
                    (int) (Math.random() * 256), Math.random()));
            hbox.getChildren().add(t);
        }

        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Horizontal Text Display");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
