package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IJuegoTest {
    @Test
    void test01AgregarJugadores() {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet");
        assertEquals(juego.cantidadDeJugadores(), 2);
    }

    @Test
    void test01Agregar4Jugadores() {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet", "Sasha", "Sam");
        assertEquals(juego.cantidadDeJugadores(), 4);
    }

    @Test
    void test02ColocarEjercitos() {
        Juego juego = new Juego();
        juego.colocarEjercitos("Pablo", 3, "Francia");
        assertEquals(juego.ejercitosDe("Pablo").size(), 3);
    }
}