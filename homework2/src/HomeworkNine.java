import java.util.Scanner;

public class HomeworkNine {
    public static void main(String[] args) {
        int length = 8;
        int arr[] = new int[length];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++)
        { int userInput = input.nextInt(); arr[i] = userInput; }
        for (int i = 0; i < length; i++)
        { System.out.println("Array Element: "+arr[i]); };
        int max = arr[0];
        for (int i = 1; i < length; i++)
        { if(arr[i] > max) {
            max = arr[i];
        }
        };

        int min = arr[0];
        for (int i = 1; i < length; i++)
        { if(arr[i] < min) {
            min = arr[i];
        }
        };

        System.out.println("Smallest number is: " + min);
        System.out.println("Biggest number is: " + max);
    }
}
