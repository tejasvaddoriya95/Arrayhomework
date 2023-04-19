//program to print numbers between 1 to 100 which can divide by 3 and 5

import java.util.Scanner;

public class Divisionby3and5 {


    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + "is divided by 3");

            if (i % 5 == 0)
                System.out.println(i + "is divided by 5");

        }
    }
}

