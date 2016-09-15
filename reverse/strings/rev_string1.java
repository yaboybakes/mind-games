import java.io.*;

public class rev_string1 {
  public static void main(String[] args) {
    String input ="";
    System.out.println("Enter the input string to be reversed");
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();
      char[] ca_input = input.toCharArray();
      for (int i = ca_input.length-1; i >= 0; i--) {
        System.out.print(ca_input[i]);
      }
        System.out.println();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
