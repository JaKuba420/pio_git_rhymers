package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TABLE_SIZE = 12;
    public static final int FULL_TOTAL = 11;
    public static final int START_TOTAL = -1;
    private final int[] NUMBERS = new int[TABLE_SIZE];

    public int total = START_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == START_TOTAL;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
