package hw.input;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;

class InputHandlerTest {

    @Test
    void getStrNumSeqs() {
        String seq1 = "1 3 5 7";
        String seq2 = "2 4 6 8";
        InputStream in = new ByteArrayInputStream((seq1 + "\n" + seq2 + "\n").getBytes());
        OutputStream out = new ByteArrayOutputStream();
        var inputHandler = new InputHandler(in, out);
        final String[][] seqs = new String[1][1];
        assertDoesNotThrow(() -> seqs[0] = inputHandler.getStrNumSeqs());
        assertEquals(seq1, seqs[0][0]);
        assertEquals(seq2, seqs[0][1]);
    }
}