package org.example;

import org.example.Builder.PizzaBuilder;
import org.example.Builder.RecetaBuilder;
import org.example.Pizza.Pizza;
import org.example.Pizza.Receta;

public class Main {
    public static void main(String[] args) {
        Director director=new Director();
        PizzaBuilder pizzaBuilder=new PizzaBuilder();
        director.pizzaChampiPollo(pizzaBuilder);
        Pizza pizza=pizzaBuilder.getPizza();
        System.out.println("Porciones: "+pizza.getPorciones());
        RecetaBuilder recetaBuilder=new RecetaBuilder();
        director.pizzaChampiPollo(recetaBuilder);
        Receta receta=recetaBuilder.getReceta();
        System.out.println("Receta::: "+receta.leer());
    }
}