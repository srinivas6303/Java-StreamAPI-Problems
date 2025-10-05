package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//sorted students by name, if names are equal sort with id

public class Problem31{
    public static void main(String[] args) {

        List<Student> students= Arrays.asList(
                new Student(101,"Alice"),
                new Student(103,"Bob"),
                new Student(102,"Raju"),
                new Student(104,"Alice")
        );


        List<Student> ans=students.stream()
                .sorted((s1,s2)->{
                    if(s1.getName().equalsIgnoreCase(s2.getName())){
                        return Integer.compare(s1.getId(),s2.getId());
                    }
                    else{
                        return s1.getName().compareToIgnoreCase(s2.getName());
                    }
        })
        .collect(Collectors.toList());


        for(Student student: ans){
            System.out.println(student);
        }
    }
}


class Student {
    int id;
    String name;


    public Student(){}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}