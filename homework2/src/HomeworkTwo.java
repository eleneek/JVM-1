import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        num2 = input.nextInt();
        System.out.println( "Whole: "+ num1 / num2);
        System.out.println( "Remain: " + num2 % num1);
    }
}
