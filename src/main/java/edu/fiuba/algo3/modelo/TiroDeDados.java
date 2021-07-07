package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

//Un conjunto de dados es una lista de valores aleatorios.
// Estos dados siempre devuelven 1.
public class TiroDeDados {
    List<Integer> valores;
    public TiroDeDados (int cantidadDeTiros) {
        valores = new ArrayList<Integer>();
		for(int i = 0; i < cantidadDeTiros; i++) valores.add (1);
    }

    public int cantidadTiros() {
        return this.valores.size();
    }

    public int getTiro(int i) {
        return this.valores.get(i);
    }

    public void ordenarDescendientemente() {
        this.valores.sort(Comparator.reverseOrder());
    }

    //compara los dados de mayor tamaño de cada TiroDeDados, uno a uno, y devuelve
    // una lista de cual TiroDeDados gano
    public List<TiroDeDados> batallarConDesventaja(TiroDeDados rival) {
        //ordenar dados de mayor a menor
        this.ordenarDescendientemente();
        rival.ordenarDescendientemente();

        //obtener tamanio minimo de cada tiro
        int minCantidadTiros =  Math.min(this.cantidadTiros(), rival.cantidadTiros());

        // obtener lista de cada ganador
        return IntStream
        .range(0, minCantidadTiros)
        .mapToObj(i -> 
			this.getTiro(i) > rival.getTiro(i)
				? this
				: rival
		).collect(Collectors.toList());
    }
}