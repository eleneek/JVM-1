import java.util.Scanner;

public class HomeworkFive {
    public static void main(String[] args) {
        int number,sum = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter four digit number: ");
        number = input.nextInt();
        int length = String.valueOf(number).length();
        while(length != 4) {
            System.out.println("Please enter valid four digit number: ");
            number = input.nextInt();
            length = String.valueOf(number).length();
        }
        while (number > 0) {
            sum +=number % 10;
            number = number / 10;
        }
        System.out.println("Sum is: " + sum);
    }
}
