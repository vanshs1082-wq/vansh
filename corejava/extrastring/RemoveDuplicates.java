import java.util.*;
class RemoveDuplicates{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c="";
  for(int i=0;i<b.length();i++){
   char y=b.charAt(i);
   if(c.indexOf(y)<0)c+=y;
  }
  System.out.println(c);
 }
}