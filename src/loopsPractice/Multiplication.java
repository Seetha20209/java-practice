package loopsPractice;

import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int multiply;

        for(int i = 1; i <= 10; i++ ){
            multiply = number * i;
            System.out.println(number +" x "+ i +" = "+ multiply );
        }
    }
}
