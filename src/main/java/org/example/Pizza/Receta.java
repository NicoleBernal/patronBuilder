package org.example.Pizza;

import java.util.List;

public class Receta {
    private final int porciones;
    private final Tamanio tamanio;
    private final List<String> ingredientes;
    private final int tiempoDeCoccion;

    public Receta(int porciones, Tamanio tamanio, List<String> ingredientes, int tiempoDeCoccion) {
        this.porciones = porciones;
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
        this.tiempoDeCoccion = tiempoDeCoccion;
    }
    public String leer(){
        return "Receta: ";
    }
}
