package HelloScanner;

import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        int sum = 0;
        Scanner StdIn = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");
            int num = StdIn.nextInt();
            sum += num;
            System.out.println("The number summed is: " + sum);
            if (sum >= 100) {
                System.out.println("The number is greater than 100");
                break;
            }
        }

    }
}
