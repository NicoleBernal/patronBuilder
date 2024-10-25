package org.example.Builder;

import org.example.IPizzaBuilder;
import org.example.Pizza.Pizza;
import org.example.Componentes.Tamanio;

import java.util.List;

public class PizzaBuilder implements IPizzaBuilder {
    private int porciones;
    private Tamanio tamanio;
    private List<String> ingredientes;
    private int tiempoDeCoccion;

    @Override
    public void setPorcion(int porcion) {
        this.porciones=porcion;
    }

    @Override
    public void setTamanio(Tamanio tamanio) {
        this.tamanio=tamanio;
    }

    @Override
    public void setTiempodeCoccion(int tiempo) {
        this.tiempoDeCoccion=tiempo;
    }

    @Override
    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes=ingredientes;
    }

    public Pizza getPizza(){
        return new Pizza(porciones,tamanio,ingredientes,tiempoDeCoccion);
    }
}
