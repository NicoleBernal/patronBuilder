package org.example;

import org.example.Componentes.Tamanio;

import java.util.List;

public interface IPizzaBuilder {
    void setPorcion(int porcion);
    void setTamanio(Tamanio tamanio);
    void setTiempodeCoccion(int tiempo);
    void setIngredientes(List<String> ingredientes);

}
