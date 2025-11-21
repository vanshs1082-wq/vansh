import java.util.ArrayList;
public class Course {
    String a;
    ArrayList<Student> b=new ArrayList<Student>();
    public Course(String x){
        a=x;
    }
    public void addStudent(Student y){
        b.add(y);
    }
    public void view(){
        for(Student s:b) System.out.println(a+" <- "+s.a);
    }
}