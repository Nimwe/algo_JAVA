package algojava;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RechercheIndicesTest {

    @Test
    void shouldfindMinMaxCorrectly() {
        int[] array1 = { 30, 40, 50, 20, 10 };
        int[] expected = { 4, 2 };
        int[] result = RechercheIndices.findMinMAx(array1);
        assertArrayEquals(expected, result);
    }

}
