package edu.fiuba.algo3.modelo;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pais {
    String nombre;
    int ejercitos;

	public Pais(String n) {
		this.nombre = n;
		this.ejercitos = 0;
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

	public Boolean atacar(Pais defensor, int cantEjercitos) {
		List<Integer> dadosAtacante = generarDados(Math.min(cantEjercitos, 3));
		List<Integer> dadosDefensor = generarDados(Math.min(defensor.ejercitos, 3));
		int victorias = (int) calcularGanador(dadosAtacante, dadosDefensor).stream()
		.filter(
			ganador -> ganador == dadosAtacante
		).count();

		//es victorioso si derrota tantos dados 
		//como ejercitos tiene el pais defensor
		return victorias >= defensor.ejercitos;
	}

	private List<List<Integer>> calcularGanador(List<Integer> dadosAtacante, List<Integer> dadosDefensor){
		//ordenar dados de mayor a menor
		dadosAtacante.sort(Comparator.reverseOrder());
		dadosDefensor.sort(Comparator.reverseOrder());
		
		int minTamanio = Math.min(dadosAtacante.size(), dadosDefensor.size());

		//comparar tiros de cada uno en orden descendiente
		return IntStream.range(0, minTamanio).mapToObj(i -> 
			dadosAtacante.get(i) > dadosDefensor.get(i) 
				? dadosAtacante 	
				: dadosDefensor
		).collect(Collectors.toList());
	}
	
	//siempre genera dados con el resultado '1'
	private List<Integer> generarDados(int soldados){
		List<Integer> dados = new ArrayList<Integer>();
		for(int i = 0; i < soldados; i++) dados.add (1);
		return dados;
	}
}