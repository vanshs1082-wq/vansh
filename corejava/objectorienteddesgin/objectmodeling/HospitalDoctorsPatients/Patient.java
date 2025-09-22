import java.util.ArrayList;
public class Patient {
    String a;
    ArrayList<Doctor> b=new ArrayList<Doctor>();
    public Patient(String x){
        a=x;
    }
    public void addDoctor(Doctor y){
        b.add(y);
    }
}