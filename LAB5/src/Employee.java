public class Employee {
    public final String Employee_id;
    public float[] salary = new float[3];
    public float total;
    public float bonus_total;

    public Employee(String id) {
        Employee_id = id;
    }

    public Employee(String id, float basic, float HRA, float TA) {
        Employee_id = id;
        salary[0] = basic;
        salary[1] = HRA;
        salary[2] = TA;
    }

    public void calc_Total() {
        total = salary[0] + salary[1] + salary[2];
    }

    public void calc_Bonus() {
        bonus_total = (float) (total * 1.1);
    }

    public static void printHighestPaid(Employee[] employees) {
        int index = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].bonus_total > employees[index].bonus_total) {
                index = i;
            }
        }
        System.out.println("employee_id = " + employees[index].Employee_id +
                " basic = " + employees[index].salary[0] +
                " HRA = " + employees[index].salary[1] +
                " TA = " + employees[index].salary[2]);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("001", 1000, 200, 200);
        Employee employee2 = new Employee("002", 1200, 100, 400);
        Employee employee3 = new Employee("003", 1500, 200, 300);
        Employee[] employees = new Employee[]{employee1, employee2, employee3};
        for (Employee employee : employees) {
            employee.calc_Total();
            employee.calc_Bonus();
        }
        Employee.printHighestPaid(employees);
    }

}

