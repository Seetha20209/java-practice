public class EvenNumbersForEach {
    public static void main(String[] args) {
        int[] evenNumbers = {1,2,3,4,5,6,7,8,9,10};
        int evenCount = 0;

        for(int numbers : evenNumbers){
            if(numbers%2==0){
                evenCount++;
            }
        }
        System.out.println(evenCount);
    }
}
