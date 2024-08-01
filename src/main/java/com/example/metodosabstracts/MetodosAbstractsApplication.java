package com.example.metodosabstracts;

import com.example.metodosabstracts.entities.Circle;
import com.example.metodosabstracts.entities.Rectangle;
import com.example.metodosabstracts.entities.Shape;
import com.example.metodosabstracts.entities.enums.Color;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os dados de N figuras (N fornecido pelo Usuário), e depois mostrar as áreas desta
* figuras na mesma ordem em que foram digitadas*/
@SpringBootApplication
public class MetodosAbstractsApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>();

        System.out.printf("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i=1; i <=n; i++ ){
            System.out.println("Shape #" + i + "data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED):");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double heifght = sc.nextDouble();
                list.add(new Rectangle(color, width, heifght));
            }else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }

}
