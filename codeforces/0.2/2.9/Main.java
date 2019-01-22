import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in); 
  int wordLength =in.nextInt(),
  charCount=in.nextInt();in.close();
   char[]chars=new char[charCount];
  
  for(int i =0,r=97;i<charCount;i++,r++)
    //97 is "a" 122 is "z"
    {if(r==123)r=97;
          chars[i]=(char) r;
    }

   
  for(int i =0,r=0;i<wordLength;i++,r++){
    
    if(r==charCount)r=0;
  System.out.print(chars[r]);  
  }}
}
