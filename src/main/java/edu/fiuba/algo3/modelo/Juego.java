package edu.fiuba.algo3.modelo;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Juego {
	List<Jugador> jugadores;

	Juego() {
		jugadores = new ArrayList<Jugador>();
	}

	public void agregarJugadores(String... nombres) {
		for(String n : nombres)
			jugadores.add(new Jugador(n));
	}

	public void colocarEjercitos(String string, int i, String string2) {
	}

	public List<Object> ejercitosDe(String string) {
		return Arrays.asList(new Object(), new Object(), new Object());
	}

	public int cantidadDeJugadores() {
		return jugadores.size();
    }

	public void agregarEjercitosAlJugador(String nombre, int i) {
		jugadores.stream()
			.filter(j -> j.obtenerNombre() == nombre)
			.findAny().get()
			.agregarEjercitos(i);
	}
}