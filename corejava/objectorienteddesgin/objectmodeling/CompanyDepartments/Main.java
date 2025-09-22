public class Main {
    public static void main(String[] args){
        Company a=new Company("Co1");
        Company.Department b=a.addDepartment("D1");
        b.addEmployee("E1");
        a.close();
    }
}