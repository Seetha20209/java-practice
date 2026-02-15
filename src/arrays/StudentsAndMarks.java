package arrays;

public class StudentsAndMarks {
    public static void main(String[] args) {
        String[] names = {"Bob", "Bieber", "Jonathan"};
        int[][] list = {
                {80, 75, 90},
                {70, 85, 88},
                {60, 72, 95}
        };

        for (int i = 0; i < names.length; i++) {

            System.out.println("Student: " + names[i]);

            for (int j = 0; j < list[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + list[i][j]);
            }

            System.out.println();
        }
    }
}
