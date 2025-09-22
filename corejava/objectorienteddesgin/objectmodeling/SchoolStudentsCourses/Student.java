import java.util.ArrayList;
public class Student {
    String a;
    ArrayList<Course> b=new ArrayList<Course>();
    public Student(String x){
        a=x;
    }
    public void addCourse(Course y){
        b.add(y);
    }
    public void view(){
        for(Course c:b) System.out.println(a+" -> "+c.a);
    }
}