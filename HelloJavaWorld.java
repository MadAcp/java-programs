import java.util.*;
import java.util.stream.Collectors;

public class HelloJavaWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java World");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 10000.0));
        employees.add(new Employee("B", 20000.0));
        employees.add(new Employee("C", 30000.0));
        employees.add(new Employee("D", 20000.0));
        employees.add(new Employee("E", 10000.0));
        employees.add(new Employee("E", 30000.0));
        System.out.println(employees);
        //employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        //System.out.println(employees);
        List<Double> empSalaries = employees.stream().map(Employee::getSalary).distinct().toList();
        Double secHighSal = empSalaries.get(1);
        //System.out.println(empSalaries);
        //Optional<Double> secondHighSalary = empSalaries.stream().skip(1).findFirst();
        //System.out.println(secondHighSalary);
        //System.out.println(empSalaries.get(1));
        List<Employee> employeesWithSecondHighSal = employees.stream().filter(employee -> employee.getSalary() == secHighSal).toList();
        System.out.println(employeesWithSecondHighSal);
    }

    static class Employee {
        String name;
        Double salary;

        public Employee(String name, Double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "{name=" + name + " , salary=" + salary +"}";
        }
    }
}
