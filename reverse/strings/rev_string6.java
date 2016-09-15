// Recursive version of reversing string;
import java.util.*;
import java.io.*;

public class rev_string6{
  public static void main(String[] args) {
    String input = "";
    System.out.println("Enter string to be reversed: ");
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();
      String output = reverse(input);
      System.out.println(output);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String reverse(String string) {
      if (string.length() <= 1) {
        return string;
      }
    return (reverse(string.substring(1)) + string.charAt(0));
  }
}
