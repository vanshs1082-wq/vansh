class Person{
 String a;int b;
 Person(String x,int y){a=x;b=y;}
}
class Teacher extends Person{
 String c;
 Teacher(String x,int y,String z){super(x,y);c=z;}
 void displayRole(){System.out.println("Teacher");}
}
class Student extends Person{
 int c;
 Student(String x,int y,int z){super(x,y);c=z;}
 void displayRole(){System.out.println("Student");}
}
class Staff extends Person{
 String c;
 Staff(String x,int y,String z){super(x,y);c=z;}
 void displayRole(){System.out.println("Staff");}
}
class SchoolSystem{
 public static void main(String[] a){
  Teacher x=new Teacher("Tom",40,"Math");
  x.displayRole();
 }
}