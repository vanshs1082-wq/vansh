import java.util.*;
class ToggleCase{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c="";
  for(int i=0;i<b.length();i++){
   char y=b.charAt(i);
   if(Character.isUpperCase(y))c+=(char)(y+32);
   else if(Character.isLowerCase(y))c+=(char)(y-32);
   else c+=y;
  }
  System.out.println(c);
 }
}