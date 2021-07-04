package edu.fiuba.algo3.modelo;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Juego {
	List<Jugador> jugadores;
	List<String> paises = Arrays.asList(
		"Puerto Rico", 
		"Colombia", 
		"Venezuela",
		"Honduras",
		"Guayana",
		"Guatemala");
	
	public List<String> getPaises() {
		return this.paises;
	}

	// Constructores 
	Juego() {
		jugadores = new ArrayList<Jugador>();
	}

	public Juego(String[] nombresJugadores) {
		jugadores = Arrays.asList(nombresJugadores)
			.stream()
			.map(n -> new Jugador(n)).collect(Collectors.toList());
	}

	// Métodos
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
		for(int i = 0; i < paises.size(); i++){ //TODO
			jugadores
				.get(i % jugadores.size())
				.asignarPais(paises.get(i));
		}
	}

	public void asignarPaisAJugador(String nombreJugador, String pais) {
		jugadores.stream()
			.filter(j -> j.nombre == nombreJugador)
			.findAny().get()
			.asignarPais(pais);
	}

	public List<String> paisesDe(String nombre) {
		Jugador jugador = jugadores.stream()
			.filter(j -> j.obtenerNombre() == nombre)
			.findAny().orElseThrow();

		return jugador.obtenerPaises();
	}
}