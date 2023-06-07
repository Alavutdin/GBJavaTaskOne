package Task2.Seminal1.lesson4.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Task2.Seminal1.lesson4.model.Teacher;

public class TeacherRepository implements UserRepository<Teacher> {
    private final List<Teacher> teachers = new ArrayList();

    public TeacherRepository() {
    }

    public List<Teacher> getAll() {
        return this.teachers;
    }

    public void add(Teacher student) {
        this.teachers.add(student);
    }

    public void remove(String fullName) {
        Iterator var2 = this.teachers.iterator();

        Teacher teacher;
        do {
            if (!var2.hasNext()) {
                return;
            }

            teacher = (Teacher)var2.next();
        } while(!teacher.getFullName().equals(fullName));

        this.teachers.remove(teacher);
    }

    public Long getMaxId() {
        Long maxId = 0L;
        Iterator var2 = this.teachers.iterator();

        while(var2.hasNext()) {
            Teacher teacher = (Teacher)var2.next();
            if (teacher.getId() > maxId) {
                maxId = teacher.getId();
            }
        }

        return maxId;
    }
}
