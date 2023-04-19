import java.util.Arrays;
import java.util.Scanner;

public class Testtheequality {
    public static void main(String[] args) {

        //intializing the arrays

        int a[] = {75, 100, 150};
        int b[] = {75, 100, 150};

        //Arras.equals(a, b) function is used to check
        //two arrays are equal or not

        boolean result = Arrays.equals(a, b);

        //condition check for result true or false

        if (result == true) {
            System.out.println("two arrays are equal");
        } else {
            System.out.println("two arrays are not equal");
        }
    }
}
