package com.anderson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void deveSomarCorretamente() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.somar(5, 3));
    }

    @Test
    void deveSubtrairCorretamente() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    void deveMultiplicarCorretamente() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    void deveDividirCorretamente() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void deveSomarNegativos() {
        Calculadora calc = new Calculadora();
        assertEquals(-8, calc.somar(-5, -3));
    }
}