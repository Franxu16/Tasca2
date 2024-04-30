/* Nombre: Fran Vidal Chiclana */
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DivisibleEntre3Test {
    @Test
    void testEsDivisible(){
        assertEquals(true, DivisibleEntre3.division(2));
    }

    @Test
    void testEsDivisible2(){
        assertEquals(true, DivisibleEntre3.division(6));
    }

    @Test
    void testEsDivisible3(){
        assertEquals(false, DivisibleEntre3.division(4));
    }
}
