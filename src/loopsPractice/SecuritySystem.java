package loopsPractice;

public class SecuritySystem {
    public static void main(String[] args) {
        int totalIDs = 100;
        int total = 0;

        for (int i = 1; i <= totalIDs ; i++) {
            if(i%9==0){
                continue;
            }
            total += 1;
        }
        System.out.println(total);
    }
}
