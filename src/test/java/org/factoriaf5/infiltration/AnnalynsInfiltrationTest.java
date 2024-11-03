package org.factoriaf5.infiltration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas para Annalyn.
 */
public class AnnalynsInfiltrationTest {

    private static final int GUARDIAS_MAXIMAS = 5;
    private static final int NUMERO_MAGICO_3 = 3;
    private static final int NUMERO_MAGICO_6 = 6;

    @Test
    @DisplayName("Annalyn puede infiltrarse si tiene más amigos que guardias")
    void testCanInfiltrate() {
        assertTrue(AnnalynsInfiltration.canInfiltrate(NUMERO_MAGICO_3, NUMERO_MAGICO_3 + 1));
        assertFalse(AnnalynsInfiltration.canInfiltrate(NUMERO_MAGICO_3, NUMERO_MAGICO_3));
    }

    @Test
    @DisplayName("Annalyn debería hacer ruido si tiene menos amigos que guardias")
    void testShouldMakeNoise() {
        assertTrue(AnnalynsInfiltration.shouldMakeNoise(NUMERO_MAGICO_3, NUMERO_MAGICO_3 - 1));
        assertFalse(AnnalynsInfiltration.shouldMakeNoise(NUMERO_MAGICO_3, NUMERO_MAGICO_3 + 1));
    }

    @Test
    @DisplayName("Annalyn puede escapar si tiene más amigos que guardias + 1")
    void testCanEscape() {
        assertTrue(AnnalynsInfiltration.canEscape(NUMERO_MAGICO_3, NUMERO_MAGICO_3 + 2));
        assertFalse(AnnalynsInfiltration.canEscape(NUMERO_MAGICO_3, NUMERO_MAGICO_3 + 1));
    }

    // Nuevos casos de prueba adicionales

    @Test
    @DisplayName("Annalyn no puede infiltrarse ni hacer ruido sin amigos ni guardias")
    void testNoInfiltrationOrNoiseWithoutGuardsOrFriends() {
        assertFalse(AnnalynsInfiltration.canInfiltrate(0, 0));
        assertFalse(AnnalynsInfiltration.shouldMakeNoise(0, 0));
    }

    @Test
    @DisplayName("Annalyn no puede escapar si no tiene suficientes amigos")
    void testCannotEscapeWithFewFriends() {
        assertFalse(AnnalynsInfiltration.canEscape(1, 1));
    }

    @Test
    @DisplayName("Annalyn puede escapar con el número máximo de guardias y muchos amigos")
    void testEscapeWithMaxGuards() {
        assertTrue(AnnalynsInfiltration.canEscape(GUARDIAS_MAXIMAS, GUARDIAS_MAXIMAS + 2));
    }

    @Test
    @DisplayName("Annalyn no puede infiltrarse con el número exacto de amigos y guardias")
    void testNoInfiltrationWithEqualFriendsAndGuards() {
        assertFalse(AnnalynsInfiltration.canInfiltrate(NUMERO_MAGICO_6, NUMERO_MAGICO_6));
    }

    @Test
    @DisplayName("Annalyn hace ruido si tiene significativamente menos amigos que guardias")
    void testMakeNoiseWithFewerFriends() {
        assertFalse(AnnalynsInfiltration.shouldMakeNoise(NUMERO_MAGICO_6, NUMERO_MAGICO_6 - 2));
    }
}
