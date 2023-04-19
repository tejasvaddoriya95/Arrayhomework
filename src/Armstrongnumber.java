//java program to check armstrong number
import java.util.Scanner;
import java.lang.Math;

public class Armstrongnumber {
      //Driver code
    public static void main(String[] args) {
        int num, temp, totaldigit = 0, res = 0, rem;
        //create an intance of scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        num = scanner.nextInt();

        temp = num;
        while (num > 0) {
            num /= 10;
            totaldigit++;
        }
        num = temp;
        while (num > 0) {
            rem = num % 10;
            res = res + (int) Math.pow(rem, totaldigit);
            num /= 10;
        }

        if (res == temp)
            System.out.println("\nArmstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
