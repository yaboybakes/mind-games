//Program that reverses a string using a LinkedList

import java.io.*;
import java.util.*;

public class rev_string4 {
  public static void main(String[] args) {
    String input = "";
    System.out.println("Enter a string to et reversed");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      input = br.readLine();
      char[] char_array_input = input.toCharArray();
      List<Character> linked_input = new LinkedList<>();
      for (char c: char_array_input) {
        linked_input.add(c);
      }
      Collections.reverse(linked_input);
      ListIterator list_input = linked_input.listIterator();
      String output = "";
      while (list_input.hasNext()) {
        output += list_input.next();
      }
      System.out.println(output);

    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
