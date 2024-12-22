import java.util.Scanner;

// Question:
// The positive integer n is given. Subtract from this number the sum of its digits.
// From the received number we soon subtract the sum of its digits and so on.
// This operation continues until the number is positive. How many times this operation will be repeated?
// Example:
// input: 21 output: 3

public class Q20_HowManyTimesToRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        while (number != 0) {
            number = number - sum_of_digits(number);
            count++;
        }

        System.out.println(count);
    }

    // sum of digits in number
    public static int sum_of_digits(int number) {
        int last_number = 0;
        int sum = 0;

        while (number != 0) {
            last_number = number % 10;
            number = number / 10;
            sum += last_number;
        }
        return sum;
    }
}