public class MobileData {
    public static void main(String[] args) {
        int totalDays = 30;
        int mbPerDay = 200;
        int totalMB = 0;

        for (int i = 1; i <= totalDays ; i++) {
            totalMB += mbPerDay;
            if(totalMB >= 5000){
                System.out.println("Max MB reached");
                break;
            }
        }
    }
}
