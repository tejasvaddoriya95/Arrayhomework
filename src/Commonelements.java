//java program to check common elements
import java.util.Scanner;

public class Commonelements {
      //driver code
    public static void main(String[] args) {
        int[] arrone = new int[5];
        int[] arrtwo = new int[5];
        int i, j;
         //create an instance of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 5 elements for first array: ");
        for (i = 0; i < 5; i++) {
            arrone[i] = scanner.nextInt();
            System.out.println("\nEnter the 5 elements for second array: ");
            for (j = 0; j < 5; j++) {
                arrtwo[j] = scanner.nextInt();

                System.out.println("\ncommon elements are");
                for (i = 0; i < 5; i++) {
                    for (j = 0; j < 5; j++) {
                        if (arrone[i] == arrtwo[j])
                            System.out.println(arrone[i] + " ");

                    }

                }

            }

        }
    }
}
