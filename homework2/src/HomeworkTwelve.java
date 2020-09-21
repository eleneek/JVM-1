import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HomeworkTwelve {
    public static void main(String[] args) {
        int length = 8;
        String arr[] = new String[length];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++)
        { String userInput = input.next(); arr[i] = userInput; }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }
}
