
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int x=in.nextInt();
  long ice=in.nextInt();
int count=0;
for(int i=0;i<x ;i++){
  char c=in.next().charAt(0);
  if (c=='+')ice+=in.nextLong();
  else{int r =in.nextInt();
  if (ice<r)count++;
  else ice-=r;
 
  }
} System.out.println(ice+"  "+count);
  
  

  
  in.close();
  }
}
