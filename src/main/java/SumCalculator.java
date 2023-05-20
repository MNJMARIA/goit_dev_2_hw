import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate sum: ");
        int inputNumber = scanner.nextInt();
        System.out.println("sum("+ inputNumber +") = " + sum(inputNumber));
        scanner.close();
    }

    public static int sum(int number) {
        if (number <= 0){
            throw new IllegalArgumentException("Number must be higher than 0! ");
        }
        int result = 0;
        for(; number > 0; number --){
            result += number;
        }
        return result;
    }
}