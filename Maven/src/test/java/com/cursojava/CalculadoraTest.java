package com.cursojava;

    // CODIGO TEST

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class CalculadoraTest {

        @Test
        void testSuma() {
            Calculadora calc = new Calculadora();
            int resultado = calc.suma(2, 3);
            assertEquals(5, resultado, "La suma de 2 + 3 debe ser 5");
        }
    }



