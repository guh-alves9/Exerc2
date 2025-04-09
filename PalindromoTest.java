import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    @Test
    public void deveRetornarTrueParaPalindromoSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Ovo"));
    }

    @Test
    public void deveRetornarTrueParaFrasesComEspacosEMaiusculas() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    public void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(ValidadorPalindromo.ehPalindromo("Exemplo"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Essa frase não é um palíndromo"));
    }

    @Test
    public void deveIgnorarPontuacoesEAcentos() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Anotaram a data da maratona"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A torre da derrota"));
    }
}
