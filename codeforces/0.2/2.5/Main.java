

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int x=in.nextInt();
  while(in.hasNext()){
      String st= in.nextLine();
      if(st.length()>10){
        
   System.out.print( st.charAt(0));   
   System.out.print( st.length()-2);
   System.out.print( st.charAt(
           st.length()-1)+"\n");
        
      }else System.out.println(st);
  }
 
  in.close();
  }
}
