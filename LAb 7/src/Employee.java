import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Employee {
    String name;
    int id;
    String department;
    double salary;

    Employee(String name, int id, String department, double salary){
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static ArrayList<Employee> sort(ArrayList<Employee> employees){
        for(int i = 0; i<employees.size(); i++){
            for (int j = i; j<employees.size(); j++ ) {
                if (employees.get(i).name.compareTo(employees.get(j).name)>0) {
                    Employee temp = employees.get(i);
                    employees.add(i,employees.get(j));
                    employees.remove(i+1);
                    employees.add(j,temp);
                    employees.remove(j+1);
                }
                else if(employees.get(i).name.equals(employees.get(j).name)
                        &&employees.get(i).id>employees.get(j).id){
                    Employee temp = employees.get(i);
                    employees.add(i,employees.get(j));
                    employees.remove(i+1);
                    employees.add(j,temp);
                    employees.remove(j+1);
                }
            }
        }
        return employees;
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee me = new Employee("She",40,"Neurology",10000);
        employees.add(me);
        employees.add(new Employee("Me",35,"Sociology",5000));
        employees.add(new Employee("She",25,"Psychology",8000));
        employees.add(new Employee("We",34,"Physics",15000));
        employees.add(new Employee("They",24,"Maths",150000));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println(employees.size());

        Employee.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        ArrayList<Employee> employees2  = new ArrayList<>();
        employees2.add(new Employee("De",35,"Sociology",5000));
        employees2.add(new Employee("DAhe",25,"Psychology",8000));
        employees2.add(new Employee("EQe",34,"Physics",15000));
        employees.addAll(employees2);
        System.out.println("After merging");
        for (Employee employee : employees) {
            System.out.println(employee);
        }




    }
}
