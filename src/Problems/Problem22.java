package Problems;

import java.util.*;
import java.util.stream.Collectors;

// Grouping employees based on department
public class Problem22 {
    public static void main(String[] args) {
        List<Employeee> list = Arrays.asList(
                new Employeee("Srinu", "IT"),
                new Employeee("Raju", "dmlt"),
                new Employeee("Vamshi", "IT"),
                new Employeee("Praveen", "IT"),
                new Employeee("Laxman", "dmlt"),
                new Employeee("Yadav", "lab")
        );

        Map<String, List<Employeee>> groupedByDept = list.stream()
                .collect(Collectors.groupingBy(Employeee::getDept));

        // Print the grouped results
        groupedByDept.forEach((dept, employees) -> {
            System.out.println(dept + ": " + employees);
        });
    }
}

class Employeee {
    private String name;
    private String dept;

    public Employeee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', dept='" + dept + "'}";
    }
}
