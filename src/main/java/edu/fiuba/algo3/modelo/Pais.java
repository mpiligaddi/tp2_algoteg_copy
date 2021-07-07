package edu.fiuba.algo3.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import java.util.stream.Collectors;

public class Pais {
    String nombre;
    int ejercitos;

	public Pais(String n) {
        this.nombre = n;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public int cantidadEjercitos() {
		return ejercitos;
	}

	public void agregarEjercitos(int cantidadEjercitos) {
        ejercitos += cantidadEjercitos;
	}

	public void atacar(Pais defensor, int cantEjercitos) {
		List<Integer> dadosAtacante = generarDados(Math.min(cantEjercitos, 3));
		List<Integer> dadosDefensor = generarDados(Math.min(defensor.ejercitos, 3));
		calcularGanador(dadosAtacante, dadosDefensor);
	}

	private int calcularGanador(List<Integer> dadosAtacante, List<Integer> dadosDefensor){
		return 0;
	}
		
	public List<Integer> generarDados(int soldados){
		List<Integer> dados = new ArrayList<Integer>();
		for(int i = 0; i < soldados; i++){
			dados.add ( (int) Math.random() % 6);
		}
		return dados;
	}
}