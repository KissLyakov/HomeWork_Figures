package com.example.javafx_test;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapes {
    Color shapeColor;

    public Shapes(Color shapeColor) {
    }

    public abstract void draw(GraphicsContext context);
}
