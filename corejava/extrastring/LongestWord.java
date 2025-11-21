import java.util.*;
class LongestWord{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String[] b=x.nextLine().split(" ");
  String c="";
  for(int i=0;i<b.length;i++)if(b[i].length()>c.length())c=b[i];
  System.out.println(c);
 }
}