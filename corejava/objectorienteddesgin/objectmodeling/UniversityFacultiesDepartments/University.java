import java.util.ArrayList;
public class University {
    String a;
    ArrayList<Department> b=new ArrayList<Department>();
    ArrayList<Faculty> c=new ArrayList<Faculty>();
    public University(String x){
        a=x;
    }
    public Department addDepartment(String x){
        Department d=new Department(x);
        b.add(d);
        return d;
    }
    public void addFaculty(Faculty f){
        c.add(f);
    }
    public void close(){
        for(Department d:b) d.clear();
        b.clear();
    }
    public class Department {
        String a;
        public Department(String x){
            a=x;
        }
        public void clear(){
        }
    }
}