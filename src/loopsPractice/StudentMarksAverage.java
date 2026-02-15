package loopsPractice;

public class StudentMarksAverage {
    public static void main(String[] args) {
        int[] marks = {45,67,80,99,25,30};
        int add = 0;
        int average = 0;

        for(int StudentMarks : marks){
            add += StudentMarks;
        }
        average = add / 6;
        System.out.println(average);
    }
}
