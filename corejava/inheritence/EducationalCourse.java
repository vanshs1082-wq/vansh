class Course{
 String a;int b;
 Course(String x,int y){a=x;b=y;}
}
class OnlineCourse extends Course{
 String c;boolean d;
 OnlineCourse(String x,int y,String z,boolean w){
  super(x,y);c=z;d=w;
 }
}
class PaidOnlineCourse extends OnlineCourse{
 int e,f;
 PaidOnlineCourse(String x,int y,String z,boolean w,int m,int n){
  super(x,y,z,w);e=m;f=n;
 }
}
class EducationalCourse{
 public static void main(String[] a){
  PaidOnlineCourse x=new PaidOnlineCourse("Java",30,"Udemy",true,200,50);
  System.out.println(x.a+" "+x.c+" "+x.e);
 }
}