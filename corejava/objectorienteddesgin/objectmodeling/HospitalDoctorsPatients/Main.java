public class Main {
    public static void main(String[] args){
        Doctor a=new Doctor("D1");
        Patient b=new Patient("P1");
        a.consult(b);
        Hospital c=new Hospital();
        c.addDoctor(a);
        c.addPatient(b);
    }
}