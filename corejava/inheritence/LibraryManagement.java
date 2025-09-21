class Book{
 String a;int b;
 Book(String x,int y){a=x;b=y;}
}
class Author extends Book{
 String c,d;
 Author(String x,int y,String z,String w){
  super(x,y);c=z;d=w;
 }
 void displayInfo(){
  System.out.println(a+" "+b+" "+c+" "+d);
 }
}
class LibraryManagement{
 public static void main(String[] a){
  Author x=new Author("Java",2020,"Tom","Writer");
  x.displayInfo();
 }
}