package com.example.javafx_test;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public abstract class Shapes {
    Color shapeColor;

    public Shapes(Color shapeColor) {
    }

    public abstract void draw(GraphicsContext context);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapes shapes = (Shapes) o;
        return Objects.equals(shapeColor, shapes.shapeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeColor);
    }
}
