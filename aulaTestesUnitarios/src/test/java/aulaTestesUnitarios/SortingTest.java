package aulaTestesUnitarios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aulaDeTestesUnitarios.Sorting;

public class SortingTest {
	@Test
    public void bubbleSort_emptyArray_emptyArray() {
        int[] expected = {};
        int[] actual = {};
        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort_sortedArray_sortedArray() {
        int[] expected = {1, 2};
        int[] actual = {1, 2};
        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort_unsortedArray_sortedArray() {
        int[] expected = {1, 2};
        int[] actual = {2, 1};
        Sorting.bubbleSort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

}
