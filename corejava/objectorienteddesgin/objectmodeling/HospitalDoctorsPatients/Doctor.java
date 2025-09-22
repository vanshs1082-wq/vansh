import java.util.ArrayList;
public class Doctor {
    String a;
    ArrayList<Patient> b=new ArrayList<Patient>();
    public Doctor(String x){
        a=x;
    }
    public void consult(Patient y){
        b.add(y);
        y.addDoctor(this);
        System.out.println(a+" consults "+y.a);
    }
}