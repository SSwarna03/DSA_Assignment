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
    List<Integer> al = new ArrayList<>();
    for ( int i = 0; i < n; i++){
        int x = sc.nextInt();
        al.add(x);
    }
    int q = sc.nextInt();
    for ( int i = 0; i <q; i++){
        sc.nextLine();
        String str = sc.nextLine();
        if ( str.equals("Insert")){
            int x = sc.nextInt();
            int y = sc.nextInt();
            al.add(x,y);
        }

        if (str.equals("Delete")){
            int z = sc.nextInt();
            al.remove(z);
        }
    }
    for ( int i = 0; i<al.size(); i++){
        System.out.print (al.get(i).toString() +" ");
    }
    }
}