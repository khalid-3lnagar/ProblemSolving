
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in); 
  String st =in.nextLine();
  in.close();
  int x = st.length()/2+1;
  int[]  list=new int[x];;
  int i=0;
 for(int r=0;r<st.length();r++){
   char c=st.charAt(r);
   if (c!='+'){
     list[i]= Character.getNumericValue(c);
     i++;} 
     }
   Arrays.sort(list);
   i=0;
 for(; i<x;i++){
   if (i==x-1)System.out.print(list[i]);
 else
  System.out.print(list[i]+"+");
  
 }
  in.close();
  }
}
