import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  private final static int PORGRAMER=1,
  MATHEMATICIAN=2,
  SPORTSMAN=3;
  
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in); 
  int childs =in.nextInt();
  Queue<Integer> pro =new LinkedList<>(),
  math=new LinkedList<>(),
  sport =new LinkedList<>();
  
  for(int i =0;i<childs;i++){
    int x=in.nextInt();
    switch (x)
    {
      case PORGRAMER: {
        pro.add(i);
        break;
     
      }
      case MATHEMATICIAN: {
        math.add(i);
        break;
      }
      case SPORTSMAN: {
        sport.add(i);
      }
    }
  }
  in.close();
 int r= Math.min (pro.size(),sport.size());
 r=Math.min(r,math.size());
 System.out.println(r);

for(int i=0;i<r;i++){
System.out.println((pro.poll()+1)+
" "+( math.poll()+1)+
" "+(sport.poll()+1));
  
}
  
  }
}
