package loopsPractice;

public class SmallestNumberForEach {
    public static void main(String[] args) {
        int[] listOfNumbers = {20,29,60,62,9,8};
        int smallestNumber = listOfNumbers[0];

        for (int numbers : listOfNumbers) {
            if (numbers < smallestNumber){
                smallestNumber = numbers;
            }
        }
        System.out.println(smallestNumber);
    }
}
