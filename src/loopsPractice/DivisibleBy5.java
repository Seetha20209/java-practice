package loopsPractice;

public class DivisibleBy5 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 100 ; i++) {
            if(i%5==0){
                total += 1;
            }
        }
        System.out.println(total);
    }
}
