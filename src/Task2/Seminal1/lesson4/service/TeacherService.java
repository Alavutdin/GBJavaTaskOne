package Task2.Seminal1.lesson4.service;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Task2.Seminal1.lesson4.model.Teacher;
import Task2.Seminal1.lesson4.model.User;
import Task2.Seminal1.lesson4.repository.TeacherRepository;
import Task2.Seminal1.lesson4.repository.UserRepository;

public class TeacherService implements UserService<Teacher> {
    private final UserRepository<Teacher> teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = this.teacherRepository.getMaxId() + 1L;
        Teacher student = new Teacher(id, fullName, age, phoneNumber);
        this.teacherRepository.add(student);
    }

    public List<Teacher> getAll() {
        return this.teacherRepository.getAll();
    }

    public List<Teacher> getAllSortUsers() {
        List<Teacher> students = this.teacherRepository.getAll();
        Collections.sort(students);
        return students;
    }

    public List<Teacher> getAllSortUsersByFamilyName() {
        List<Teacher> students = this.teacherRepository.getAll();
        students.sort(new UserComparator());
        return students;
    }

    public List<Teacher> getAllSortUsersByAge() {
        List<Teacher> students = this.teacherRepository.getAll();
        students.sort(Comparator.comparing(User::getAge));
        return students;
    }

    public void removeUser(String fullName) {
        this.teacherRepository.remove(fullName);
    }
}
