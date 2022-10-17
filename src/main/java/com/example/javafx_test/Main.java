package com.example.javafx_test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(250,300);
        GraphicsContext context = canvas.getGraphicsContext2D();
        Circle circle = new Circle(Color.BLACK, 90,50);
        Rectangle rectangle = new Rectangle(Color.GREEN, 90, 150);
        Shapes[] shapes = new Shapes[] {circle,rectangle};

        for (Shapes shape : shapes){
            shape.draw(context);
        }

        Group group = new Group();
        Scene scene = new Scene(group, 250,300);
        group.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
