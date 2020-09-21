import java.util.Scanner;

public class HomeworkThree {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input =   new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = input.nextInt();
        System.out.println("Enter second number : ");
        num2 = input.nextInt();
        System.out.println("Enter third number : ");
        num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        int multiply = num1 * num2 * num3;
        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + multiply);
    }
}
