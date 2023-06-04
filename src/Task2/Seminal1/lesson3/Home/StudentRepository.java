package Task2.Seminal1.lesson3.Home;

import lombok.Getter;

import java.util.ArrayList;

@Getter

public class StudentRepository {
    private final StudentGroup studentGroup;


    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }

}
