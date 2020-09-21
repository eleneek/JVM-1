import java.util.Scanner;
public class HomeworkFour {
    public static void main(String[] args) {
        int number;
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter three digit number: ");
        number = input.nextInt();
        int length = String.valueOf(number).length();
        while(length != 3) {
            System.out.println("Please enter valid three digit number: ");
            number = input.nextInt();
            length = String.valueOf(number).length();
        }
        while (number > 0) {
            System.out.println( number % 10);
            number = number / 10;
        }
    }
}
