import java.util.*;
class CompareStrings{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c=x.nextLine();
  int i=0;
  while(i<b.length()&&i<c.length()&&b.charAt(i)==c.charAt(i))i++;
  if(i==b.length()&&i==c.length())System.out.println("Equal");
  else if(i==b.length()|| (i<c.length()&&b.charAt(i)<c.charAt(i)))System.out.println(b+" comes before "+c);
  else System.out.println(c+" comes before "+b);
 }
}