package Task2.Seminal1.lesson4.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Task2.Seminal1.lesson4.service.TeacherGroupIterator;

public class TeacherGroup implements Iterable<Teacher> {
    private final List<Teacher> studentsList = new ArrayList();

    public TeacherGroup() {
    }

    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this.studentsList);
    }

    public void addStudent(Teacher student) {
        this.studentsList.add(student);
    }

    public List<Teacher> getStudentsList() {
        return this.studentsList;
    }

    public String toString() {
        return "StudentGroup(studentsList=" + this.getStudentsList() + ")";
    }
}
