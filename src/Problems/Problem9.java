package Problems;

import Practice.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Sort employees by salary
 */
public class Problem9 {
    public static void main(String[] args) {
        ArrayList<Employee> list=new  ArrayList<>();

        list.add(new Employee("Alice",50000));
        list.add(new Employee("bob",70000));
        list.add(new Employee("rob",40000));
        list.add(new Employee("john",10000));

        List<Employee> sortedEmp = list.stream()
                //sorted employee by name
                .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))

                //sorted  employees by salary
                //.sorted((e1,e2)->Integer.compare(e1.getSalary(), e2.getSalary()))
                //.sorted((e1, e2) -> e1.getSalary()- e2.getSalary())
                .collect(Collectors.toList());


        for(Employee e:sortedEmp){
            System.out.println(e);
        }
    }
}

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
