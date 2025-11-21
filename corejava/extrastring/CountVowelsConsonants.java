import java.util.*;
class CountVowelsConsonants{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine().toLowerCase();
  int c=0,d=0;
  for(int i=0;i<b.length();i++){
   char y=b.charAt(i);
   if("aeiou".indexOf(y)>=0)c++;
   else if(y>='a'&&y<='z')d++;
  }
  System.out.println(c+" "+d);
 }
}