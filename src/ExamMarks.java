public class ExamMarks {
    public static void main(String[] args) {
        String[] Students = {"Satya", "Yashna", "Praveen"};
        int[][] Marks = {
                {80,90,90},
                {60,70,80},
                {50,50,50}
        };


        for (int i = 0; i < Students.length ; i++) {
            int sum = 0;
            System.out.println("Student name is: " + Students[i]);
            for (int j = 0; j < Marks[i].length; j++){
                sum += Marks[i][j];
                System.out.println("Subject Marks: " + Marks[i][j]);
            }
            System.out.println("Total Marks: " + sum);
        }
    }
}
