package hw.numlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumListsTest {

    @Test
    void compareAvarageIsGreater() {
        var numList1 = mock(INumList.class);
        var numList2 = mock(INumList.class);
        when(numList1.getAvarage()).thenReturn(9);
        when(numList2.getAvarage()).thenReturn(5);
        int[] result = new int[1];
        assertDoesNotThrow(() -> result[0] = NumLists.compareAvarage(numList1, numList2));
        assertTrue(result[0] > 0);
    }

    @Test
    void compareAvarageIsLess() {
        var numList1 = mock(INumList.class);
        var numList2 = mock(INumList.class);
        when(numList1.getAvarage()).thenReturn(5);
        when(numList2.getAvarage()).thenReturn(9);
        int[] result = new int[1];
        assertDoesNotThrow(() -> result[0] = NumLists.compareAvarage(numList1, numList2));
        assertTrue(result[0] < 0);
    }

    @Test
    void compareAvarageIsEqual() {
        var numList1 = mock(INumList.class);
        var numList2 = mock(INumList.class);
        when(numList1.getAvarage()).thenReturn(5);
        when(numList2.getAvarage()).thenReturn(5);
        int[] result = new int[1];
        assertDoesNotThrow(() -> result[0] = NumLists.compareAvarage(numList1, numList2));
        assertEquals(0, result[0]);
    }
}