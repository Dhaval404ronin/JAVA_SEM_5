package com.example.demo2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the chart axes
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Create the bar chart
        javafx.scene.chart.BarChart<String, Number> barChart = new javafx.scene.chart.BarChart<>(xAxis, yAxis);
        barChart.setTitle("Overall Grade Breakdown");

        // Create the data series for the chart
        Series<String, Number> series = new Series<>();
        series.setName("Percentage");
        series.getData().add(new Data<>("Projects", 20));
        series.getData().add(new Data<>("Quizzes", 10));
        series.getData().add(new Data<>("Midterm Exams", 30));
        series.getData().add(new Data<>("Final Exam", 40));

        // Customize the appearance of each bar
        for (Data<String, Number> data : series.getData()) {
            Rectangle bar = new Rectangle(0, 0);
            bar.setWidth(10);
            bar.setHeight(data.getYValue().doubleValue() * 2); // Adjust the height of the bars
            bar.setFill(getColor(data.getXValue()));
            data.setNode(bar);
        }

        // Add the series to the chart
        barChart.getData().add(series);

        // Create the main layout
        VBox vbox = new VBox(barChart);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        // Create the scene and show the stage
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Grade Bar Chart");
        primaryStage.show();
    }

    private Color getColor(String category) {
        switch (category) {
            case "Projects":
                return Color.RED;
            case "Quizzes":
                return Color.BLUE;
            case "Midterm Exams":
                return Color.GREEN;
            case "Final Exam":
                return Color.ORANGE;
            default:
                return Color.BLACK;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
