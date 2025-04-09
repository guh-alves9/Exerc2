import java.text.Normalizer;

public class ValidadorPalindromo {

    public static boolean ehPalindromo(String texto) {
        if (texto == null || texto.isBlank()) {
            return false;
        }

        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "") 
                .replaceAll("[^a-zA-Z0-9]", "") 
                .toLowerCase();

        String invertido = new StringBuilder(normalizado).reverse().toString();
        return normalizado.equals(invertido);
    }
}
