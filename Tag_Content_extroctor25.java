import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		String regex = "<(.+)>([^<>]+)</(\\1)>";
        Pattern p = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases-- > 0) {
            String line = sc.nextLine();
            Matcher match = p.matcher(line);

            if (match.find()) {
                match.reset();
                while (match.find()) {
                System.out.println(match.group(2));
                }
            } else {
                System.out.println("None");
            }
        }

        sc.close();
    }

}


