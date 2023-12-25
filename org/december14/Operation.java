package org.december14;

public class Operation {
    private int sum;

    // Supplier function
    public static Operation supplier() {
        return new Operation();
    }

    // Accumulator function
    public void add(int num) {
        sum += num;
    }

    // Combiner function for parallel streams
    public void combine(Operation other) {
        sum += other.sum;
    }

    // Getter for the sum
    public int getSum() {
        return sum;
    }
}
