public class Multiplicationtable {

    public static void main(String[] args) {

        int row, colomn;
        System.out.println("multiplication table \n");
        row = 1; //initialization

        do {
            colomn = 1;
            do {
                int x = row * colomn;
                System.out.printf("%4d", +x);
                ;
                colomn = colomn + 1;
            } while (colomn <= 3);
            System.out.println("\n");
            row = row + 1;
        } while (row <= 3);
    }
}
