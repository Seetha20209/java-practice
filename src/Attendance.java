public class Attendance {
    public static void main(String[] args) {
        int classes = 30;
        int holiday = 0;
        int attendedDays = 0;

        for (int i = 1; i <= classes ; i++) {
            if(i%7==0){
                continue;
            }
                attendedDays += 1;
        }
        System.out.println(attendedDays);
    }
}
