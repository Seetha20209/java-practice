public class DivisibleBy11 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50 ; i++) {
            if(i%11==0){
                break;
            }
            System.out.println(i);
        }
    }
}