package paulapallas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidadorContrasenaTest {
    @Test
    void testContraseñaDebeTenerAlMenosOchoCaracteres() {
        ValidadorContraseña validador = new ValidadorContraseña();
        assertFalse(validador.esValida("Ab1!")); // Demasiado corta
        assertTrue(validador.esValida("Abcd123!")); // Cumple con la longitud
    }

    @ParameterizedTest
    @CsvSource({"Ab1!,false", "Abcd123!,true"})
    void testContraseñaDebeTenerAlMenosOchoCaracteres(String contraseña, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, validador.esValida(contraseña));
    }

    @ParameterizedTest
    @CsvSource({"abcdefg1!,false", "Abcdefg1!,true"})
    void testContraseñaDebeContenerUnaMayúscula(String contraseña, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, validador.esValida(contraseña));
    }

    @ParameterizedTest
    @CsvSource({"ABCDEFG1!,false", "Abcdefg1!,true"})
    void testContraseñaDebeContenerUnaMinúscula(String contraseña, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, validador.esValida(contraseña));
    }

    @ParameterizedTest
    @CsvSource({"Abcdefgh!,false", "Abcdefg1!,true"})
    void testContraseñaDebeContenerUnNúmero(String contraseña, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, validador.esValida(contraseña));
    }

    @ParameterizedTest
    @CsvSource({"Abcdefg1,false", "Abcdefg1!,true"})
    void testContraseñaDebeContenerUnCaracterEspecial(String contraseña, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, validador.esValida(contraseña));
    }

    
}
