package loopsPractice;

public class Deposit {
    public static void main(String[] args) {
        int amount = 1000;
        int month = 12;
        int total = 0;

        for (int i = 1; i <= month ; i++) {
            total += amount;
        }
        System.out.println(total);
    }
}
