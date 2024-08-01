package com.example.metodosabstracts.entities;

import com.example.metodosabstracts.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(){

    }

    public Shape(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }


    public void setColor(Color color){
        this.color = color;
    }

    // como estamos usando um metodo abstracts, OBRIGATORIAMENTE a classe deve ser abcstract
    public abstract double area();


}
