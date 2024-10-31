package org.factoriaf5.infiltration;

/**
 * Clase que gestiona la infiltración de Annalyn.
 */
public final class AnnalynsInfiltration { // Ahora es final

    private static final int MAX_GUARDIAS = 5; // Número máximo de guardias permitidos

    // Constructor privado para evitar instanciación
    private AnnalynsInfiltration() {
        throw new UnsupportedOperationException("No instantiation allowed");
    }

    /**
     * Método para verificar si Annalyn puede infiltrarse.
     *
     * @param guardias Número de guardias presentes.
     * @param amigos Número de amigos de Annalyn.
     * @return Verdadero si Annalyn puede infiltrarse, falso en caso contrario.
     */
    public static boolean canInfiltrate(int guardias, int amigos) {
        return amigos > guardias;
    }

    /**
     * Método para determinar si Annalyn debería hacer ruido.
     *
     * @param guardias Número de guardias presentes.
     * @param amigos Número de amigos de Annalyn.
     * @return Verdadero si Annalyn debería hacer ruido, falso en caso contrario.
     */
    public static boolean shouldMakeNoise(int guardias, int amigos) {
        return guardias > amigos && guardias <= MAX_GUARDIAS;
    }

    /**
     * Método que determina si se puede escapar.
     *
     * @param guardias Número de guardias presentes.
     * @param amigos Número de amigos de Annalyn.
     * @return Verdadero si Annalyn puede escapar, falso en caso contrario.
     */
    public static boolean canEscape(int guardias, int amigos) {
        return amigos > guardias + 1; // Annalyn puede escapar si tiene al menos un amigo más que guardias
    }
}
