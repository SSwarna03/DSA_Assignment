import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        java.util.BitSet B1 = new BitSet(n);
        java.util.BitSet B2 = new BitSet(n);

        java.util.BitSet[] bitsets = { B1, B2};

        for(int i= 0; i < m ; i++){
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch(String.valueOf(op)){
                case "AND" :{
                    bitsets[x-1].and(bitsets[y-1]);
                    break;
                }
                case "OR" :{
                    bitsets[x-1].or(bitsets[y-1]);
                    break;
                }
                case "XOR" :{
                    bitsets[x-1].xor(bitsets[y-1]);
                    break;
                }
                case "FLIP" :{
                    bitsets[x-1].flip(y);
                    break;
                }
                case "SET" :{
                    bitsets[x-1].set(y);
                    break;
                }
            }
            System.out.printf("%d %d\n", B1.cardinality(),B2.cardinality());
        }
    } 
}