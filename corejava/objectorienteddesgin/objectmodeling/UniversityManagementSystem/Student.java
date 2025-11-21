import java.util.ArrayList;
public class Student {
    String a;
    ArrayList<Course> b=new ArrayList<Course>();
    public Student(String x){
        a=x;
    }
    public void enrollCourse(Course y){
        b.add(y);
        System.out.println(a+" enrolled "+y.a);
    }
}