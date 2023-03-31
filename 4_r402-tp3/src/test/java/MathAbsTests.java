import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathAbsTests {

    @ParameterizedTest
    @MethodSource("fournirEntreesEtAttendus")
    void testMathAbs(int entree, int attendu) {
        assertEquals(attendu, Math.abs(entree));
    }

    static Stream<Arguments> fournirEntreesEtAttendus() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(-1, 1),
                Arguments.of(2, 2),
                Arguments.of(-2, 2),
                Arguments.of(-552, 552)
        );
    }

    @ParameterizedTest
    @MethodSource("fournirEntrees")
    void testMathAbs(int entree) {
        assertTrue(Math.abs(entree)>=0);
    }

    static Stream<Integer> fournirEntrees() {
        return Stream.of(0, 1, -1, 2, -2, Integer.MAX_VALUE, Integer.MIN_VALUE, -552);
    }

    /* Dans la documentation de la méthode abs :
      Note that if the argument is equal to the value of Integer.MIN_VALUE, the most negative representable int value,
      the result is that same value, which is negative.
      Le problème vient du fait qu'on essaye de faire - sur le nombre le plus petit.
     */
}
