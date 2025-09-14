import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] array1 = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(2, array1.length);
        assertEquals(0, array1[0]);
        assertEquals(1, array1[1]);

        int[] array2 = twoSum.twoSum(new int[]{3,2,4}, 6);
        assertEquals(2, array2.length);
        assertEquals(1, array2[0]);
        assertEquals(2, array2[1]);

        int[] array3 = twoSum.twoSum(new int[]{3,3}, 6);
        assertEquals(2, array3.length);
        assertEquals(0, array1[0]);
        assertEquals(1, array1[1]);
    }
}