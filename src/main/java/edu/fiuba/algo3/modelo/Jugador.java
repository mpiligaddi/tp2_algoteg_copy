package edu.fiuba.algo3.modelo;
import java.util.List;
import java.util.ArrayList;

public class Jugador {
	String nombre;
	List<String> paises;
	List<Object> ejercitos;

	public Jugador(String n) {
		nombre = n;
		paises = new ArrayList<String>();
		ejercitos = new ArrayList<Object>();
	}

	public List<String> obtenerPaises() {
		return this.paises;
	}

	public Object obtenerNombre() {
		return nombre;
	}

	public void agregarEjercitos(int cantidad) {
		for (int i = 0; i < cantidad; i++){
			ejercitos.add(new Object());
		}
	}
	public void asignarPais(String pais) {
		paises.add(pais);
	}

	public void asignarEjercitosAPais(int cantidad, String pais) throws Exception {
		if(cantidad > ejercitos.size())
			throw new Exception();
		if (!paises.contains(pais)) 
			throw new Exception();
		
	}

}
