package edu.fiuba.algo3.modelo;

public class Ataque {
    Ataque(Pais atacante, Pais defensor, int cantidadEjercitosAtacante) throws Exception {
        if (atacante.cantidadEjercitos() <= cantidadEjercitosAtacante)
            throw new Exception("Pais debe tener más ejércitos de los que  envía el jugador");

        
    }
}