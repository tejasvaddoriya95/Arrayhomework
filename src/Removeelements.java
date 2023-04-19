import java.util.Scanner;
import java.util.Arrays;

public class Removeelements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n = scanner.nextInt();    //Array Size Initialization

        Integer arr[] = new Integer[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++)     //Array Initialization
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int elem = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem)   //If element found
            {
                // shifting elements
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        System.out.println("Elements after deletion ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



