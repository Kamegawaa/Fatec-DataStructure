import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class teclado {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int entra = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < entra; i++) {
                String plv = sc.nextLine();
                char[] plvArray = plv.toCharArray();
                int size = plvArray.length;
                int[] plvNums = new int[size];

                for (int j = 0; j < size; j++) {
                    if (plvArray[j] == 'A' || plvArray[j] == 'B' || plvArray[j] == 'C') {
                        plvNums[j] = 2;
                    } else if (plvArray[j] == 'D' || plvArray[j] == 'E' || plvArray[j] == 'F') {
                        plvNums[j] = 3;
                    } else if (plvArray[j] == 'G' || plvArray[j] == 'H' || plvArray[j] == 'I') {
                        plvNums[j] = 4;
                    } else if (plvArray[j] == 'J' || plvArray[j] == 'K' || plvArray[j] == 'L') {
                        plvNums[j] = 5;
                    } else if (plvArray[j] == 'M' || plvArray[j] == 'N' || plvArray[j] == 'O') {
                        plvNums[j] = 6;
                    } else if (plvArray[j] == 'P' || plvArray[j] == 'Q' || plvArray[j] == 'R' || plvArray[j] == 'S') {
                        plvNums[j] = 7;
                    } else if (plvArray[j] == 'T' || plvArray[j] == 'U' || plvArray[j] == 'V') {
                        plvNums[j] = 8;
                    } else {
                        plvNums[j] = 9;
                    }
                }
                for (int num : plvNums) {
                    System.out.print(num);
                }
                System.out.println();
            }
            break;
        }

        sc.close();
    }
}