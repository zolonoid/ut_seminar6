package hw;

import hw.input.InputHandler;
import hw.numlist.NumList;
import hw.numlist.NumLists;

import java.io.InputStream;
import java.io.OutputStream;

public final class Programm {
    private Programm() {
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(final String[] args) throws Exception {
        run(System.in, System.out);
    }

    /**
     * @param input
     * @param output
     * @throws Exception
     */
    public static void run(final InputStream input,
                           final OutputStream output) throws Exception {
        var inputHandler = new InputHandler(input, output);
        String[] numSeqs = inputHandler.getStrNumSeqs();
        var numList1 = new NumList();
        numList1.addNumSeqStr(numSeqs[0]);
        var numList2 = new NumList();
        numList2.addNumSeqStr(numSeqs[1]);
        NumLists.compareAvarage(numList1, numList2, output);
    }
}
