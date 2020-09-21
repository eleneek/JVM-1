import java.util.Arrays;
import java.util.Scanner;

public class HomeworkTen {
    public static void main(String[] args) {
        int length = 8;
        int arr[] = new int[length];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++)
        { int userInput = input.nextInt(); arr[i] = userInput; }
        Arrays.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
}
