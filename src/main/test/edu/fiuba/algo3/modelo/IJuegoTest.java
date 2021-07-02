package edu.fiuba.algo3.modelo;

public class IJuegoTest {
    test01AgregarJugadores() {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet");
        assertEquals(juego.cantidadDeJugadores(), 2);
    }

    test02ColocarEjercitos() {
        Juego juego = new Juego();
        juego.colocarEjercitos("Pablo", 3, "Francia");
        assertEquals(juego.ejercitosDe("Pablo").size(), 3);
    }
}