package edu.kis.vh.nursery;

/**
 * Class HanoiRhymer extends DefaultCountingOutRhymer class.
 * It overrides one method and implements one method, that
 * help create array, in which every element is less than
 * previous element
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int STARTING_TOTAL_REJECTED = 0;
    private int totalRejected = STARTING_TOTAL_REJECTED;

    /**
     * This method gives you an information, about how
     * many times value was rejected from being added into
     * the NUMBERS array
     * @return int Number of rejected countIn() method calls
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * This method overrides DefaultCountingOutRhymer method.
     * Adds an integer parameter in into the NUMBERS array,
     * unless array is not empty and in value is less than
     * last element in the NUMBERS array
     * @param in The value you want to add to NUMBERS array
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }
}
