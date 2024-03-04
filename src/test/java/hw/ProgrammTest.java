package hw;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammTest {

    @Test
    void run() {
        InputStream in = new ByteArrayInputStream("1 3 5 7\n2 4 6 8\n".getBytes());
        var out = new ByteArrayOutputStream();
        assertDoesNotThrow(() -> Programm.run(in, out));
        String result = out.toString().split("\n")[2];
        assertEquals("Второй список имеет большее среднее значение.", result);
    }
}