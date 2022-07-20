package ThirtyDaysOfCode;

//This problem is about unit testing.

public class DayTwentySeven {
    //TODO:
    //In the class TestDataEmptyArray:
    //get_array() returns an empty array
    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[]{};
        }
    }

    //TODO:
    //in the class TestDataUniqueValues:
    //get_array() returns an array of size at least 2 with all unique elements
    //get_expected_result() returns the expected minimum value index for this array
    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[] {0,1};
        }
        public static int get_expected_result() {
            return 0;
        }
    }

    //TODO:
    //In the class TestDataExactlyTwoDifferentMinimums:
    //get_array() returns an array where the minimum value occurs at exactly 2 indices
    //get_expected_result() returns the expected index
    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[] {5,5,8};
        }
        public static int get_expected_result() {
            return 0;
        }
    }
}
