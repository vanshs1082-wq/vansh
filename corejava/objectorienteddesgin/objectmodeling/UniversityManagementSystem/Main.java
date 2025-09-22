public class Main {
    public static void main(String[] args){
        Student a=new Student("S1");
        Course b=new Course("Math");
        Professor c=new Professor("P1");
        a.enrollCourse(b);
        c.assignProfessor(b);
    }
}