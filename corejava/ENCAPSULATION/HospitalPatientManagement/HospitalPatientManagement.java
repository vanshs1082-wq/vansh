// HospitalPatientManagement.java
import java.util.*;

public class HospitalPatientManagement {
    public static void main(String[] args){
        Patient p1 = new InPatient("P001","Asha",30,5);
        Patient p2 = new OutPatient("P002","Vikram",40);
        ((MedicalRecord)p1).addRecord("Admitted with fever");
        ((MedicalRecord)p2).addRecord("Consultation: headache");
        List<Patient> list = Arrays.asList(p1,p2);
        for(Patient p: list){
            System.out.println(p.getPatientDetails()+", bill="+p.calculateBill());
        }
    }
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    public Patient(String id,String name,int age){ this.patientId=id; this.name=name; this.age=age; }
    public String getPatientId(){ return patientId; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public String getPatientDetails(){ return name+" ("+patientId+"), age " + age; }
    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private StringBuilder records = new StringBuilder();
    public InPatient(String id,String name,int age,int days){ super(id,name,age); this.days=days; }
    @Override public double calculateBill(){ return days*2000 + 500; }
    @Override public void addRecord(String record){ records.append(record).append("\n"); }
    @Override public String viewRecords(){ return records.toString(); }
}

class OutPatient extends Patient implements MedicalRecord {
    private StringBuilder records = new StringBuilder();
    public OutPatient(String id,String name,int age){ super(id,name,age); }
    @Override public double calculateBill(){ return 300; }
    @Override public void addRecord(String record){ records.append(record).append("\n"); }
    @Override public String viewRecords(){ return records.toString(); }
}
