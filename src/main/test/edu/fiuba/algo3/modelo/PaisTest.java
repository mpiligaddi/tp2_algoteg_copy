package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaisTest {
    @Test
    public void test01NombrarPais() {
        Pais pais = new Pais("Estados Unidos");
        assertEquals("Estados Unidos", pais.obtenerNombre());
    }
    @Test
    public void test01AtacarPais() {
        Pais atacante = new Pais("Estados Unidos");
        Pais defensor = new Pais("Canada");

        atacante.agregarEjercitos(3);
        defensor.agregarEjercitos(3);

        Boolean conquisto = atacante.atacar(new Pais("Canada"), 1);
        assertEquals("false", conquisto);
    }
}