import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentImplementation {
    public static void main(String[] args) {
        List<Student> studentList =
                Arrays.asList(
                        new Student("Vaibhav", 12, "Vaibhav", "Diwan"),
                        new Student("Ramesh", 4, "Ramesh", "Sharma"),
                        new Student("Suresh", 18, "Suresh", "Sharma"),
                        new Student("Rohit", 14, "Rohit", "Sharma"),
                        new Student("Virat", 51, "Virat", "Kohli")
                        );
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);
        System.out.println("-------------------------------");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
