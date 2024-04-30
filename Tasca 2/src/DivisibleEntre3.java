/* Nombre: Fran Vidal Chiclana */

public class DivisibleEntre3 {
    public static boolean division(int n) {
        StringBuilder numeroConcatenado = new StringBuilder();

        for (int i = 1; i <= n; i++) { /* Bucle que concatena los numeros en uno entero */
            numeroConcatenado.append(i);
        }

        int sumDigits = 0;
        /* Consigue los valores de cada numero del gran numero concatenado */
        for (int i = 0; i < numeroConcatenado.length(); i++) {
            sumDigits += Character.getNumericValue(numeroConcatenado.charAt(i));
        }
        return sumDigits % 3 == 0;
    }
}
