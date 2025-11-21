import java.util.*;
class PalindromeCheck{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c="";
  for(int i=b.length()-1;i>=0;i--)c+=b.charAt(i);
  if(b.equals(c))System.out.println("Palindrome");
  else System.out.println("Not");
 }
}