import java.util.LinkedList;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String st= in.nextLine();
  LinkedList <Character> list = new LinkedList<>();
   for(char c: st.toCharArray()){
     if (c !='{'&&c!=','&&c!='}'&&c!=' '){
       if (!list.contains(c))
       list.add(c);
     }
   }
  if(list.isEmpty())System.out.println(0);
  else System.out.println(list.size());
  in.close();
  }
}
