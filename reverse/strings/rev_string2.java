import java.io.*;

public class rev_string2 {
  public static void main(String[] args) {
    try {
      String input = "";
      System.out.println("Enter string to be reversed");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();

      StringBuilder sb_string = new StringBuilder();
      sb_string.append(input);
      sb_string.reverse();

      System.out.println(sb_string);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
