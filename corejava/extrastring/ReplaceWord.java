import java.util.*;
class ReplaceWord{
 public static void main(String[] a){
  Scanner x=new Scanner(System.in);
  String b=x.nextLine(),c=x.nextLine(),d=x.nextLine();
  String[] y=b.split(" ");
  String z="";
  for(int i=0;i<y.length;i++){
   if(y[i].equals(c))z+=d+" ";
   else z+=y[i]+" ";
  }
  System.out.println(z.trim());
 }
}