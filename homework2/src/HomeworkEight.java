import java.util.Scanner;

public class HomeworkEight {
    public static void main(String[] args) {
        double num1,num2;
        Scanner input =   new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = input.nextDouble();
        System.out.println("Enter second number : ");
        num2 = input.nextDouble();
        int num1Int = (int) num1;
        int num2Int = (int) num2;


        for (int i = num1Int+1; i < num2Int; i++) {
            System.out.println(i);
        }

    }
}
