/**
 * A simple counter that can be incremented and decremented.
 */
public class Counter {

    private int value;

    /**
     * Reset the counter to zero.
     */
    public void reset() {
        value = 0;
    } 

    /**
     * Increment the counter by one.
     */
    public void inc() {
        value += 1;
    }

    /** 
     * Decrement the counter by one.
     */
    public void dec() {
        value -=1;
    }

    /**
     * Get the value of the counter
     * @return The current value of the counter.
     */
    public int getValue() {
        return value;
    }
}
