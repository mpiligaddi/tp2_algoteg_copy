package edu.fiuba.algo3.modelo;
import java.util.List;
import java.util.ArrayList;

public class Jugador {
	String nombre;
	List<Object> ejercitos;
	public Jugador(String n) {
		nombre = n;
		ejercitos = new ArrayList<Object>();
	}
	public Object obtenerNombre() {
		return nombre;
	}
	public void agregarEjercitos(int cantidad) {
		for (int i = 0; i < cantidad; i++){
			ejercitos.add(new Object());
		}
	}

}
