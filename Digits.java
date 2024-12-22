import java.util.Scanner;

// Question: Find the number of digits in a nonnegative integer n.
// Example:
// input: 12343, output: 5
public class Digits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String string_number = String.valueOf(number);

        System.out.println(string_number.length());
    }
}