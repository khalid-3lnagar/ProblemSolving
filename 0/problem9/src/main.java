import java.util.Scanner;
public class main {

  public static void main(String[] args) {
   Scanner input =new Scanner(System.in);
   String s=input.next();

  char c=s.charAt(0);

   if (c>96)
   System.out.print((char)(c-32));
   else System.out.print(c);
   for (int i =1 ;i<s.length();i++){
     System.out.print(s.charAt(i));
   }
   input.close();
  }
}
