public class Main {
    public static void main(String[] args){
        Student a=new Student("S1");
        Student b=new Student("S2");
        Course c=new Course("Math");
        Course d=new Course("Sci");
        a.addCourse(c);
        b.addCourse(c);
        c.addStudent(a);
        c.addStudent(b);
        School e=new School();
        e.addStudent(a);
        e.addStudent(b);
        a.view();
        c.view();
    }
}