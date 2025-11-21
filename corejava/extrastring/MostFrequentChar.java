import java.util.*;
class MostFrequentChar{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine();
  int m=0;char r=' ';
  for(int i=0;i<b.length();i++){
   char y=b.charAt(i);
   int c=0;
   for(int j=0;j<b.length();j++)if(b.charAt(j)==y)c++;
   if(c>m){m=c;r=y;}
  }
  System.out.println(r);
 }
}