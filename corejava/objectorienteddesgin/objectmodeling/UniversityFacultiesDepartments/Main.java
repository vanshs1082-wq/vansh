public class Main {
    public static void main(String[] args){
        University a=new University("U1");
        Faculty b=new Faculty("F1");
        a.addFaculty(b);
        University.Department c=a.addDepartment("CS");
        a.close();
        System.out.println(b.a);
    }
}