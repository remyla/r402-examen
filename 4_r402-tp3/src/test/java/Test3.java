import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3 {

    @ParameterizedTest
    @ValueSource(ints = {-1})
    void testWithEmptyString(Integer number) {
        assertEquals(1, Math.abs(number));
    }

    @ParameterizedTest
    @MethodSource("provideInts")
    void testMathAbsWithSourceMethod(int a, int b) {
        assertEquals(b, Math.abs(a));
    }

    static Stream<Arguments> provideInts() {
        return Stream.of(
                Arguments.of(-1, 1),
                Arguments.of(-2, 2),
                Arguments.of(-3, 3),
                Arguments.of(-4, 4)
        );
    }

    /**
     * Pas eu le temps pour le dernier test
     */


}
