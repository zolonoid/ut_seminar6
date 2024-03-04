package hw.numlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumListTest {

    @Test
    void addNumSeqStr() {
        var numList = new NumList();
        assertDoesNotThrow(() -> numList.addNumSeqStr("1 3 5 7 9"));
        assertEquals(numList.get(0), 1);
        assertEquals(numList.get(1), 3);
        assertEquals(numList.get(2), 5);
        assertEquals(numList.get(3), 7);
        assertEquals(numList.get(4), 9);
    }

    @Test
    void addNumSeqStrException() {
        var numList = new NumList();
        assertThrows(Exception.class, () -> numList.addNumSeqStr("1 3 a 7 9"));
    }

    @Test
    void getAvarage() {
        var numList = new NumList();
        assertDoesNotThrow(() -> numList.addNumSeqStr("1 3 5 7 9"));
        int avarage = numList.getAvarage();
        assertEquals(avarage, 5);
    }
}