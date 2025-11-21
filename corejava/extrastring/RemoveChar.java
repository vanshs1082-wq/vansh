import java.util.*;
class RemoveChar{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine();
  char y=x.next().charAt(0);
  String c="";
  for(int i=0;i<b.length();i++)if(b.charAt(i)!=y)c+=b.charAt(i);
  System.out.println(c);
 }
}