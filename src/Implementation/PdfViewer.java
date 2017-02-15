import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PdfViewer
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++)
        {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int lengh = word.length();
        int max = 0;

        for (int i = 0; i < lengh; i++)
        {
            char tempChar = word.charAt(i);
            max = max < h[tempChar - 97] ? h[tempChar - 97] : max;
        }
        System.out.println(max * lengh);

    }
}