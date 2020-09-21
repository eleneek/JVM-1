import java.util.Arrays;
import java.util.Scanner;

public class HomeworkEleven {
    public static void main(String[] args) {
        int length = 8;
        int arr[] = new int[length];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++)
        { int userInput = input.nextInt(); arr[i] = userInput; }
        System.out.println("Array is: " + Arrays.toString(arr));
    }
}
