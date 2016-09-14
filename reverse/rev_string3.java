import java.io.*;

public class rev_string3 {
  public static void main(String[] args) {
     String input = "";
     System.out.println("Enter a string you would like reversed");
     try {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     input = br.readLine();
     int left = 0;
     char[] ca_input = input.toCharArray();
     int right = ca_input.length-1;
     for (left = 0; left < right; left++,right--) {
       char temp = ca_input[left];
       ca_input[left] = ca_input[right];
       ca_input[right] = temp;
     }
     System.out.println(ca_input);
   } catch (IOException e) {
     e.printStackTrace();
   }
  }
}
