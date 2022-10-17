package com.example.javafx_test;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shapes{
    private double posX;
    private double posY;

    public Circle(Color shapeColor, int posX, int posY){
        super(shapeColor);
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.setFill(this.shapeColor);
        context.setStroke(this.shapeColor);
        context.strokeOval(this.posX,this.posY,50,50);
    }
}

