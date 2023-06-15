package Task2.Seminal1.lesson5.lesson4.service;

import Task2.Seminal1.lesson5.lesson4.model.Student;

import java.util.List;

public class NewStudentService implements UserService<Student> {
    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public List<Student> getAllSortUsers() {
        return null;
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return null;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return null;
    }

    @Override
    public void removeUser(String fullName) {

    }
}
