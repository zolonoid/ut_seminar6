package hw.numlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class NumList extends ArrayList<Integer> implements INumList {
    /***/
    private static final String DELIMITER = " ";

    /**
     * @param numSeq
     * @throws Exception
     */
    public void addNumSeqStr(final String numSeq) throws Exception {
        try {
            this.addAll(numSeqStrToNums(numSeq));
        } catch (Exception e) {
            throw new Exception("Number sequence format error.");
        }
    }

    @Override
    public int getAvarage() {
        int sum = this.stream().reduce(0, Integer::sum);
        return sum / this.size();
    }

    private List<Integer> numSeqStrToNums(final String numSeq) {
        String[] split = numSeq.split(DELIMITER);
        return Arrays.stream(split).map(Integer::parseInt).toList();
    }
}
