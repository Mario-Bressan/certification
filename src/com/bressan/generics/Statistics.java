package com.bressan.generics;

public class Statistics<T extends Number> {
    T[] nums;

    //receives in the constructor an array of any numerical type
    public Statistics(T[] o) {
        nums = o;
    }

    //calculate the average of the array
    double average() {
        double sum = 0.0;

        for (T num : nums)
            sum += num.doubleValue();

        return sum/nums.length;
    }

    //compares if the average of the array received in the constructor is equal
    //to the average of the array passed in the method
    boolean sameAverage(Statistics<?> obj) {
        return average() == obj.average();
    }
}
