import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int[] arr = new int[a];
        int count=0; 
        for (int i = 0 ; i < a ; i++){ 
            arr[i] = sc.nextInt();
            
        }  
        for(int i = 0 ;i< a ; i++) { 
             int sum =0; 
            for (int j = i; j < arr.length;j++){
                sum += arr[j];
                if (sum <0){
                
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}