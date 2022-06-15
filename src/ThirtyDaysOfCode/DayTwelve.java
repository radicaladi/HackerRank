//package ThirtyDaysOfCode;
//
//// You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
//// Completed code for Person and a declaration for Student are provided for you in the editor.
//// Observe that Student inherits all the properties of Person.
//
//public class DayTwelve {
//    // for purpose of challenge record, I am keeping this class as the day of challenge rather than converting to "Student" extends "Person"
//    private int[] testScores;
//
//    /*
//     *   Class Constructor
//     *
//     *   @param firstName - A string denoting the Person's first name.
//     *   @param lastName - A string denoting the Person's last name.
//     *   @param id - An integer denoting the Person's ID number.
//     *   @param scores - An array of integers denoting the Person's test scores.
//     */
//    // Write your constructor here
//    public Student(String firstName, String lastName, int idNumber, int[] scores) {
//        super(firstName, lastName, idNumber);
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.idNumber = idNumber;
//        this.testScores = scores;
//    }
//
//    /*
//     *   Method Name: calculate
//     *   @return A character denoting the grade.
//     */
//    // Write your method here
//    public char calculate() {
//        int sum = 0;
//        for (int testScore : testScores) {
//            sum = sum + testScore;
//        }
//        sum = sum / testScores.length;
//        if (90 <= sum && sum <= 100) {
//            return 'O';
//        } else if (80 <= sum && sum < 90) {
//            return 'E';
//        } else if (70 <= sum && sum < 80) {
//            return 'A';
//        } else if (55 <= sum && sum < 70) {
//            return 'P';
//        } else if (40 <= sum && sum < 55) {
//            return 'D';
//        } else if (0 <= sum && sum < 40) {
//            return 'T';
//        } else
//            return Character.MIN_VALUE;
//    }
//}
