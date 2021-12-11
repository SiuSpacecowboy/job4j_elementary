package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {2, 10, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {32, 13, 154, 55, 66};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {13, 32, 55, 66, 154};
        Assert.assertArrayEquals(expected, result);
    }
}