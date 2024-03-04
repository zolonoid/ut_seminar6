package hw.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public final class InputHandler {
    /***/
    private Scanner scanner;
    /***/
    private OutputStream output;

    /**
     * @param in
     * @param out
     */
    public InputHandler(final InputStream in, final OutputStream out) {
        createInputOtput(in, out);
    }

    /**
     * @return numSeqs
     * @throws IOException
     */
    public String[] getStrNumSeqs() throws IOException {
        var numSeqs = new String[2];
        numSeqs[0] = requestNumSeq(1);
        numSeqs[1] = requestNumSeq(2);
        return numSeqs;
    }

    private void createInputOtput(final InputStream in,
                                  final OutputStream out) {
        if (in == null || out == null) {
            throw new NullPointerException();
        }
        createScanner(in);
        this.output = out;
    }

    private void createScanner(final InputStream input) {
        scanner = new Scanner(input);
    }

    private String requestNumSeq(final int index) throws IOException {
        output.write(("Введите последовательность чисел №"
                + Integer.toString(index)
                + " через пробел...\n").getBytes());
        return scanner.nextLine();
    }
}
