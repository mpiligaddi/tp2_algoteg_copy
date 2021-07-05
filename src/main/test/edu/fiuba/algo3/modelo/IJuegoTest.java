package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IJuegoTest {
    @Test
    public void test00AgregarJugadores() {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet");
        assertEquals(juego.cantidadDeJugadores(), 2);
    }

    @Test
    public void test01Agregar4Jugadores() {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet", "Sasha", "Sam");
        assertEquals(juego.cantidadDeJugadores(), 4);
    }

    @Test
    public void test02ColocarEjercitos() throws Exception {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet", "Sasha", "Sam");
        juego.agregarEjercitosAlJugador("Pablo", 3);

        assertThrows(Exception.class, () -> juego.colocarEjercitos("Pablo", 3, "Colombia"));
        juego.asignarPaisAJugador("Pablo", "Colombia");
        assertDoesNotThrow(() -> juego.colocarEjercitos("Pablo", 3, "Colombia"));

        assertEquals(juego.cantidadEjercitosDe("Pablo"), 3);
    }

    @Test
    public void test03AsignarPaisesAJugadores() {
        String[] jugadores = { "Pedro", "Mohammed", "Alexis" };
        Juego juego = new Juego(jugadores);
        juego.asignarPaisesAleatoriamente();
        assertTrue(juego.paisesDe("Pedro").size() > 0);

        //repartir paises entre los jugadores es una particion
        List<String> paisesDeJugadores = Arrays.asList(jugadores)
            .stream()
            .flatMap( j -> juego.paisesDe(j).stream())
            .collect(Collectors.toList());
        assertEquals(new HashSet<>(juego.getPaises()), new HashSet<>(paisesDeJugadores));
    }

    @Test
    public void test04AgregarVariosSoldados() throws Exception {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Avneet", "Sasha", "Sam");
        juego.agregarEjercitosAlJugador("Pablo", 3);
        assertEquals(juego.cantidadEjercitosDe("Pablo"), 3);
        juego.agregarEjercitosAlJugador("Pablo", 4);
        assertEquals(juego.cantidadEjercitosDe("Pablo"), 7);
    }

    @Test
    public void test05AtaqueDeUnPaisAOtro() throws Exception {
        Juego juego = new Juego();
        juego.agregarJugadores("Pablo", "Mohammed");
        juego.asignarPaisAJugador("Pablo", "Colombia");
        juego.asignarPaisAJugador("Mohammed", "Venezuela");

        juego.agregarEjercitosAlJugador("Pablo", 10);
        juego.agregarEjercitosAlJugador("Mohammed", 10);

        juego.agregarEjercitosAlPais("Colombia", 6);
        juego.agregarEjercitosAlPais("Venezuela", 1);

        assertDoesNotThrow(() -> juego.realizarAtaque("Colombia", 3, "Venezuela"));
    }
}