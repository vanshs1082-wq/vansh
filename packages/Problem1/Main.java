import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args){
        Student s=new Student("Aman Sharma",101);
        Faculty f=new Faculty("Dr. Mehta","Data Structures");
        s.displayName();
        s.displayRoll();
        f.displayName();
        f.displaySubject();
    }
}
