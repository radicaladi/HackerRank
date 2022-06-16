package ThirtyDaysOfCode;

/*
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the _elements instance variable.
A computeDifference method that finds the maximum absolute difference between
any 2 numbers in _elements and stores it in the maximumDifference instance variable.
* */

public class DayFourteen {
    // Note: class instance and inputs not provided as per hackerrank
    public Difference (int[] n) {
        elements = n;
    }

    public void computeDifference() {
        int min = elements[0];
        int max = elements[0];
        for(int i = 0; i < elements.length; i++) {
            if(elements[i]<min) {
                min=elements[i];
            }
            if(elements[i]>max) {
                max=elements[i];
            }
        }
        maximumDifference = Math.abs(max-min);
    }
}
