package org.example;

import org.example.Componentes.Tamanio;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public void pizzaChampiPollo(IPizzaBuilder pizzaBuilder){
        List<String> ingredientes=new ArrayList<>();
        ingredientes.add("Queso Mozarella");
        ingredientes.add("Pollo");
        ingredientes.add("Champiñones");
        ingredientes.add("Harina");
        ingredientes.add("Levadura");
        ingredientes.add("Pasta de tomate");
        pizzaBuilder.setPorcion(4);
        pizzaBuilder.setTamanio(Tamanio.PERSONAL);
        pizzaBuilder.setTiempodeCoccion(30);
        pizzaBuilder.setIngredientes(ingredientes);
    }

}
