package org.example.Pizza;

import java.util.List;

public class Pizza{
    private final int porciones;
    private final Tamanio tamanio;
    private final List<String> ingredientes;
    private final int tiempoDeCoccion;

    public Pizza(int porciones, Tamanio tamanio, List<String> ingredientes, int tiempoDeCoccion) {
        this.porciones = porciones;
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
        this.tiempoDeCoccion = tiempoDeCoccion;
    }

    public int getPorciones() {
        return porciones;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public int getTiempoDeCoccion() {
        return tiempoDeCoccion;
    }

}
