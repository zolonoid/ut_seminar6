package hw.numlist;

import java.io.IOException;
import java.io.OutputStream;

public final class NumLists {
    /***/
    private static final byte[] GREATER;
    /***/
    private static final byte[] LESS;
    /***/
    private static final byte[] EQUAL;

    static {
        GREATER = "Первый список имеет большее среднее значение.\n".getBytes();
        LESS = "Второй список имеет большее среднее значение.\n".getBytes();
        EQUAL = "Средние значения равны.\n".getBytes();
    }

    private NumLists() {
    }

    /**
     * @param list1
     * @param list2
     * @param logTo
     * @return result
     * @throws IOException
     */
    public static int compareAvarage(final INumList list1,
                                     final INumList list2,
                                     final OutputStream logTo) throws IOException {
        int avg1 = list1.getAvarage();
        int avg2 = list2.getAvarage();
        int result = Integer.compare(avg1, avg2);
        if (logTo != null) {
            printResult(result, logTo);
        }
        return result;
    }

    /**
     * @param list1
     * @param list2
     * @return compare
     * @throws IOException
     */
    public static int compareAvarage(final INumList list1,
                                     final INumList list2) throws IOException {
        return compareAvarage(list1, list2, null);
    }

    private static void printResult(final int result,
                                    final OutputStream out) throws IOException {
        if (result > 0) {
            out.write(GREATER);
        } else if (result < 0) {
            out.write(LESS);
        } else {
            out.write(EQUAL);
        }
    }
}
