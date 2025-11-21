import java.util.*;
class SubstringOccurrences{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c=x.nextLine();
  int d=0;
  for(int i=0;i<=b.length()-c.length();i++)
   if(b.substring(i,i+c.length()).equals(c))d++;
  System.out.println(d);
 }
}