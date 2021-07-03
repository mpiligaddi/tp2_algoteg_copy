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

	public void colocarEjercitos(String jugador, int cantidad, String pais) throws Exception {
		jugadores.stream()
			.filter(j -> j.obtenerNombre() == jugador)
			.findAny().get()
			.asignarEjercitosAPais(cantidad, pais);
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

	public void asignarPaisesAleatoriamente() {
	}

	public void asignarPaisAJugador(String nombreJugador, String pais) {
		jugadores.stream()
		.filter(j -> j.nombre == nombreJugador)
		.findAny().get()
		.asignarPais(pais);
	}
}