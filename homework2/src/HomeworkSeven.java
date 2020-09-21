import java.util.Scanner;

public class HomeworkSeven {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static int lcm(int a, int b)
    {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        int num1,num2, ans1, ans2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        num2 = input.nextInt();
        ans1 = gcd(num1, num2);
        ans2 = lcm(num1,num2);
        System.out.println("Greatest common divider is: " + ans1);
        System.out.println("Least  common multiple  is: " + ans2);
    }
}
