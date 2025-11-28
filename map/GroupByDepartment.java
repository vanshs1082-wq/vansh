import java.util.*;

class Employee {
    String name;
    String dept;
    Employee(String n, String d) {
        name = n;
        dept = d;
    }
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", "HR");
        Employee e2 = new Employee("Bob", "IT");
        Employee e3 = new Employee("Carol", "HR");
        List<Employee> list = Arrays.asList(e1, e2, e3);
        HashMap<String, List<Employee>> map = new HashMap<>();
        for (Employee e : list) {
            if (!map.containsKey(e.dept)) {
                map.put(e.dept, new ArrayList<>());
            }
            map.get(e.dept).add(e);
        }
        System.out.println(map);
    }
}
