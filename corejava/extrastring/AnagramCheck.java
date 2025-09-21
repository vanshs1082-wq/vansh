import java.util.*;
class AnagramCheck{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c=x.nextLine();
  char[] y=b.toCharArray(),z=c.toCharArray();
  Arrays.sort(y);Arrays.sort(z);
  if(Arrays.equals(y,z))System.out.println("Anagram");
  else System.out.println("Not");
 }
}