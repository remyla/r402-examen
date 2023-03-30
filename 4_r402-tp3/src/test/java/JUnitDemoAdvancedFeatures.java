import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitDemoAdvancedFeatures {

    private static List<Integer> l;

    // les tags @BeforeEach et @AfterEach permettent d'exécuter du code avant et après chaque test
    // ils sont utiles pour préparer l'état du système, ou pour annuler les effets des tests
    @BeforeEach
    void setUpBeforeEach() {
        System.out.println("Avant un test");
        l.add(3);
        l.add(1);
        l.add(2);
    }

    @AfterEach
    void tearDownAfterEach() {
        l.clear();
        System.out.println("Après un test");
    }

    // les méthodes taguées @BeforeAll et @AfterAll sont exécutées avant et après le lancement de la suite de test
    // elles sont utiles pour des appels qui prennent du temps et qu'on ne veut pas répéter à chaque test (par exemple,
    // créer ou fermer une connexion avec une BDD)
    // les méthodes ainsi taguées doivent être statiques
    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Avant l'exécution de la suite");
        l = new ArrayList<>();
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("Après l'exécution de la suite");
    }

    // l'assertion fail échoue si elle est exécutée
    // elle permet de vérifier qu'un cas n'est pas atteignable
    @Test
    void testWithFail() {
        if (l == null) {
            l = List.of(3, 4);
        } else if (l.isEmpty()) {
            l.add(3);
        } else {
            fail();
        }
        assertEquals(3, l.get(0));
    }

    // la première assertion qui échoue entraîne la fin du test, les assertions suivantes ne sont pas exécutées
    @Test
    void testWithMultipleAssertions() {
        assertTrue(l.size() >= 10);
        assertEquals(27, l.get(9));
    }

    // pour exécuter plusieurs assertions même en cas d'échec, il faut utiliser assertAll
    // assertAll prend des arguments de type Executable
    // pour cela, on intègre les assertions dans des lambda-expressions (notation () -> ...)
    @Test
    void testWithMultipleAssertionsInARow() {
        assertAll(
                () -> assertEquals(30, l.get(0)),
                () -> assertEquals(1, l.get(1)),
                () -> assertEquals(20, l.get(2))
        );
    }

    // on peut aussi vérifier qu'une méthode lance une exception avec assertThrows
    // là encore il faut utiliser les lambda-expressions
    @Test
    void testWithAnException() {
        NullPointerException e = assertThrows(
                NullPointerException.class,
                () -> { int[] a = null; Arrays.sort(a); }
        );
        // assertThrows retourne l'exception qui a été lancée pendant le test, on peut donc l'utiliser
        assertTrue(e.getMessage().startsWith("C"));
    }

    // assertThrows demande le type de l'exception attendue
    // ici le test échoue, car l'exception n'est pas du bon type
    // on peut utiliser le type Exception pour accepter n'importe quelle exception
    @Test
    void testWithABadException() {
        assertThrows(
                ArithmeticException.class,
                () -> { int[] a = null; Arrays.sort(a); }
        );
    }

    // on peut tester qu'une fonction s'exécute en un temps donné (ici 100ms) avec assertTimeout
    @Test
    void testWithATimeoutAssertion() {
        assertTimeout(
                Duration.ofMillis(100),
                () -> Collections.sort(l)
        );
    }

    // on peut aussi appliquer un timeout à l'échelle d'un test, à l'aide du tag @Timeout
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testWithATimeout() {
        Collections.sort(l);
    }

    // les hypothèses (assumptions) fonctionnent de la manière suivante : si la condition est fausse, alors le test
    // s'arrête et n'est pas comptabilisé (ce n'est pas un échec, contrairement à une assertion)
    // ces commandes permettent de mettre des conditions sur un test, puisque les assertions qui suivent ne seront
    // exécutées que si l'hypothèse est vraie
    @Test
    void testWithAssumption() {
        Assumptions.assumeTrue(LocalDate.now().getYear() == 2012);
        int i = 1 + 1;
        assertEquals(3, i);
    }

    // les tests paramétriques sont très utiles pour répéter le même test sur plusieurs valeurs
    // un test paramétrique prend un argument (ici un entier i) et est tagué par @ParameterizedTest au lieu de @Test
    // le tag @ValueSource donne les valeurs à utiliser pour les différentes itérations du test
    @ParameterizedTest
    @ValueSource(ints = {3, 0, 27, -2})
    void testWithAParameter(int i) {
        assertEquals(i, Math.max(i, 0));
    }

    // pour écrire un test avec plusieurs paramètres, on peut utiliser le tag @MethodSource qui indique que les données
    // seront fournies par une méthode (ici appelée myInputStream). Cette méthode peut être définie n'importe où, du
    // moment qu'elle est visible et qu'elle retourne un Stream<Arguments>
    @ParameterizedTest
    @MethodSource("myInputStream")
    void testWithMultipleParameters(int a, int b, int c) {
        assertEquals(c, b + a);
    }

    // voici la méthode utilisée pour générer des données de test
    static Stream<Arguments> myInputStream() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(0, 3, 3),
                Arguments.of(-1, 2, 3),
                Arguments.of(-1, -1, -2)
        );
    }

    // les tests peuvent être organisés en groupes
    // pour cela on utilise une classe interne non-statique, avec le tag @Nested
    @Nested
    @DisplayName("Un groupe de tests")
    class TestGroup {

        // en plus de faciliter l'organisation, les groupes permettent aussi de définir des méthodes @BeforeEach ou
        // @AfterEach propres à certains tests
        // regardez la sortie pour voir dans quel ordre sont exécutées les différentes méthodes

        @BeforeEach
        void setupNestedTest() {
            System.out.println("Avant un test du groupe");
        }

        @AfterEach
        void tearDownNestedTest() {
            System.out.println("Après un test du groupe");
        }

        @Test
        void nestedTestOne() {
            System.out.println("Premier test du groupe");
            assertTrue(2 > 1);
        }

        @Test
        void nestedTestTwo() {
            System.out.println("Second test du groupe");
            assertTrue(3 > 1);
        }

    }

    // on peut désactiver un test avec le tag @Disabled
    // il n'est pas lancé dans la suite, mais on peut toujours le lancer individuellement
    @Test
    @Disabled
    void disabledTest() {
        assertEquals(1, 2);
    }

    // on peut aussi désactiver les tests en fonction de certaines conditions (OS, version du runtime Java, etc...)
    @Test
    @DisabledOnJre(JRE.JAVA_17)
    void conditionallyDisabledTest() {
        assertFalse(2 > 0);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void conditionallyEnabledTest() {
        assertTrue(0 > 1);
    }

    // on peut aussi définir ses propres catégories de tests à l'aide de @Tag
    // par la suite il est possible de ne lancer que certaines catégories de tests (par exemple en créant une
    // configuration d'exécution dédiée dans IntelliJ, ou bien en créant une suite de tests marquée avec @IncludeTags)
    @Test
    @Tag("critique")
    void taggedTest() {
        assertEquals(4, 2 + 2);
    }

}
