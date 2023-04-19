import java.util.Arrays;
import java.util.Scanner;

public class ArrayinAscendingOrder {

    public static void main(String[] args) {
        //create instance of scanner class
        Scanner scanner = new Scanner(System.in);
        int n; //Array size declaration
        System.out.println("Entre the number of elements");
        n = scanner.nextInt();
        //Array declaration
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.printf("sorted arr[] : %s",
                Arrays.toString(arr));

    }
}
