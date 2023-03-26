import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> li =  Arrays.asList(1,2,3);
        List<String> ls = Arrays.asList("Hello","World");

        print(li);
        print(ls);
}

    private static void print(List<?> list) {
        for(Object y : list) {    
            System.out.println(y);
        }
    }
}