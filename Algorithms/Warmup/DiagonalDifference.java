import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        int i,j,s1,s2;
        int l = a.length;
        
        i=s1=s2=0;
        j = l-1;
        while(i<l)
        { s1 +=  a[i][i];
         s2 += a[i][j];
         i++;
         j--;
        }
        return (Math.abs(s1-s2));
        /*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
