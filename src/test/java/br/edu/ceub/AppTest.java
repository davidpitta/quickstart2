package br.edu.ceub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void somar_2_e_3_retorna_5() {
        // Preparar
        App appUnderTest = new App();

        // Executar
        int  result = appUnderTest.somar(2, 3);

        // Verificar
        assertEquals(5, result);
    }

    @Test
    void soma_numero_negativo_com_positivo() {
        // Preparar
        App appUnderTest = new App();

        // Executar
        int  result = appUnderTest.somar(5, -3);

        // Verificar
        assertEquals(2, result);
    }

    @Test
    void soma_envolvendo_numero_0() {
        // Preparar
        App appUnderTest = new App();

        // Executar
        int  result = appUnderTest.somar(3, 0);

        // Verificar
        assertEquals(3, result);
    }
}
