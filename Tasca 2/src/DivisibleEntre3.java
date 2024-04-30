/* Nombre: Fran Vidal Chiclana */

public class DivisibleEntre3 {
    public static boolean division(int n, boolean salida) {
        StringBuilder numeroConcatenado = new StringBuilder();

        for (int i = 1; i <= n; i++) { /* Concatena los numeros en uno y almacena el resultado en el StringBuilder */
            numeroConcatenado.append(i);
        }

        int sumDigits = 0;
        /* Almacena el valor numerico de los numeros que componen el numero concatenado */
        for (int i = 0; i < numeroConcatenado.length(); i++) {
            sumDigits += Character.getNumericValue(numeroConcatenado.charAt(i));
        }
        boolean esDivisiblePor3 = sumDigits % 3 == 0;
        return esDivisiblePor3 == salida;
    }
}
