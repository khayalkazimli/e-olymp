import java.util.Scanner;

// Question:
// Write a program which reads a two-digit number and prints every digit, separated by a space.
// Example:
// input: 23 output: 2 3

public class Q1_SimpleProblem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // split_by_character(number);

        // only for two-digit number
        System.out.printf("%d %d\n", number / 10, number % 10);
    }

    public static void split_by_character(int number) {

        String text_number = String.valueOf(number);

        for (int i = 0; i < text_number.length(); i++) {
            System.out.printf("%c ", text_number.charAt(i));
        }
        System.out.printf("\n");
    }
}