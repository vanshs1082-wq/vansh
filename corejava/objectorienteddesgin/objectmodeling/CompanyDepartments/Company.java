import java.util.ArrayList;
public class Company {
    String a;
    ArrayList<Department> b=new ArrayList<Department>();
    public Company(String x){
        a=x;
    }
    public Department addDepartment(String x){
        Department d=new Department(x);
        b.add(d);
        return d;
    }
    public void close(){
        for(Department d:b) d.clear();
        b.clear();
    }
    public class Department {
        String a;
        ArrayList<Employee> b=new ArrayList<Employee>();
        private Department(String x){
            a=x;
        }
        public void addEmployee(String x){
            b.add(new Employee(x));
        }
        public void clear(){
            b.clear();
        }
        public class Employee {
            String a;
            private Employee(String x){
                a=x;
            }
        }
    }
}