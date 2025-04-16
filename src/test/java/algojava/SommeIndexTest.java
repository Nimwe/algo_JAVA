package algojava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SommeIndexTest {

    @Test
    void shouldCorrectlySearchIndexI(){
        int[] tableau = { 10, 20, 30, 40, 50 };
        int result = SommeIndex.searchIndexi(tableau, 20);
        assertEquals(20, result);

    }

    @Test
    void shouldSumIndexCorrectly (){
        int[] tableau = { 10, 20, 30, 40, 50 };
        int result = SommeIndex.sumIndex(tableau, 1, 4);
        assertEquals(90, result);
    }

























}