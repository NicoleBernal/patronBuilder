package org.example;

import org.example.Pizza.Tamanio;

import java.util.List;

public interface IPizza {
    void setPorcion(int porcion);
    void setTamanio(Tamanio tamanio);
    void setTiempodeCoccion(int tiempo);
    void setIngredientes(List<String> ingredientes);

}
