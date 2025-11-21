public class Professor {
    String a;
    public Professor(String x){
        a=x;
    }
    public void assignProfessor(Course y){
        System.out.println(a+" teaches "+y.a);
    }
}