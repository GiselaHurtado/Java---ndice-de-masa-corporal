package dev.gisela.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorImcTest {

    @Test
    public void testDelgadezSevera() {
        assertEquals("La persona tiene delgadez severa.", CalculatorImc.calcularIMC(40, 1.75));
    }

    @Test
    public void testDelgadezModerada() {
        assertEquals("La persona tiene delgadez moderada.", CalculatorImc.calcularIMC(50, 1.75));
    }

    @Test
    public void testDelgadezLeve() {
        assertEquals("La persona tiene delgadez leve.", CalculatorImc.calcularIMC(55, 1.75));
    }

    @Test
    public void testPesoNormal() {
        assertEquals("La persona tiene peso normal.", CalculatorImc.calcularIMC(68, 1.75));
    }

    @Test
    public void testSobrepeso() {
        assertEquals("La persona tiene sobrepeso.", CalculatorImc.calcularIMC(80, 1.75));
    }

    @Test
    public void testObesidadLeve() {
        assertEquals("La persona tiene obesidad leve.", CalculatorImc.calcularIMC(95, 1.75));
    }

    @Test
    public void testObesidadMedia() {
        assertEquals("La persona tiene obesidad media.", CalculatorImc.calcularIMC(110, 1.75));
    }

    @Test
    public void testObesidadMorbida() {
        assertEquals("La persona tiene obesidad mórbida.", CalculatorImc.calcularIMC(130, 1.75));
    }
}
