package edu.fiuba.algo3.modelo;

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

	public void atacar(Pais defensor, int cantSoldados) {
		//TODO implementar ataque
	}
    
}