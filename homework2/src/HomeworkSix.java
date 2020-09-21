import java.util.Scanner;

public class HomeworkSix {
    public static void main(String[] args) {
        int number,sum = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter number: ");
        number = input.nextInt();
        while (number > 0) {
            sum +=number % 10;
            number = number / 10;
        }
        System.out.println("Sum is: " + sum);
    }
}
