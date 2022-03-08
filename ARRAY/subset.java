import java.io.*;
import java.util.Scanner;

class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // *This will print the no of subsets which are made from the size of the array
        // for eg in an array of size 3 the total no of sets will be 2^3 = 8.

        int limit = (int) Math.pow(2, a.length);

        // * Create a loop i which will run through the limit and traverse through each
        // subset of the array one by one

        for (int i = 0; i < limit; i++) {

            int temp = i;
            String set = "";

            // * Now create another loop which will print the subsets according to the
            // binary logic if 0 then it will print - if 1 then it will print the element of
            // the array.

            for (int j = a.length - 1; j >= 0; j--) {
                int remainder = temp % 2;
                temp = temp / 2;

                if (remainder == 0) {
                    set = "-\t" + set;
                } else {
                    set = a[j] + "\t" + set;
                }

            }
            System.out.println(set);
        }
    }
}