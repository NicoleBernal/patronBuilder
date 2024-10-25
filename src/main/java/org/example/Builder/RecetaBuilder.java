package org.example.Builder;

import org.example.IPizzaBuilder;
import org.example.Pizza.Receta;
import org.example.Componentes.Tamanio;

import java.util.List;

public class RecetaBuilder implements IPizzaBuilder {
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

    public Receta getReceta(){
        return new Receta(porciones,tamanio,ingredientes,tiempoDeCoccion);
    }
}
