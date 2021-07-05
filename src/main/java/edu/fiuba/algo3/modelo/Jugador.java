package edu.fiuba.algo3.modelo;
import java.util.List;
import java.util.ArrayList;

public class Jugador {
	String nombre;
	List<Pais> paises;
	List<Object> ejercitos;

	public Jugador(String n) {
		nombre = n;
		paises = new ArrayList<Pais>();
		ejercitos = new ArrayList<Object>();
	}

	public Object obtenerNombre() {
		return nombre;
	}

	public List<Pais> obtenerPaises() {
		return this.paises;
	}

	public int cantidadEjercitos() {
		return this.ejercitos.size();
	}

	public int obtenerCantidadEjercitos() { return this.ejercitos.size(); }

	public void agregarEjercitos(int cantidad) {
		for (int i = 0; i < cantidad; i++){
			ejercitos.add(new Object());
		}
	}
	public void asignarPais(Pais pais) {
		paises.add(pais);
	}

	public void asignarEjercitosAPais(int cantidad, Pais pais) throws Exception {
		if(cantidad > ejercitos.size())
			throw new Exception();
		if (!paises.contains(pais)) 
			throw new Exception();
		
	}
	public void atacar(int cantidadSoldadosDefensor) {}

}
