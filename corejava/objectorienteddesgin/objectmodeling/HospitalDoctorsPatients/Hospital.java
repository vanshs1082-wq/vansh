import java.util.ArrayList;
public class Hospital {
    ArrayList<Doctor> a=new ArrayList<Doctor>();
    ArrayList<Patient> b=new ArrayList<Patient>();
    public void addDoctor(Doctor x){
        a.add(x);
    }
    public void addPatient(Patient x){
        b.add(x);
    }
}