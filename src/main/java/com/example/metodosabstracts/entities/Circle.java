package com.example.metodosabstracts.entities;

import com.example.metodosabstracts.entities.enums.Color;

// Como essa classe extends da super classe Shape, ela é obrigada a implementação o metodo AREA()
public class Circle extends Shape{

    private double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
