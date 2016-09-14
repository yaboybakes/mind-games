import java.io.*;
import java.util.*;

public class rev_string5 {
  public static void main(String[] args){
    String input = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter word to be reversed: ");

    try {
      input = br.readLine();
      Stack<Character> stack = new Stack<Character>();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < input.length() ; i++) {
        stack.push(input.charAt(i));
      }
      while (!stack.empty()) {
        sb.append(stack.pop());
      }
      System.out.println(sb);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
