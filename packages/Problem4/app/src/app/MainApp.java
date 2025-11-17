package app;

import college.student.Student;

public class MainApp {
    public static void main(String[] args){
        Student s=new Student("Riya",502);
        System.out.println("Student: "+s.getName()+" ("+s.getId()+")");
    }
}
