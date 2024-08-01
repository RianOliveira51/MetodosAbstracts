package com.example.metodosabstracts.entities;

import com.example.metodosabstracts.entities.enums.Color;

// Como essa classe extends da super classe Shape, ela é obrigada a implementação o metodo AREA()
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, double width, double heeight) {
        super(color);
        this.width = width;
        this.height = heeight;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }
}
