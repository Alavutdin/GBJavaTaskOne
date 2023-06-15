package Task2.Seminal1.lesson5.lesson4.service;

import Task2.Seminal1.lesson5.lesson4.model.Teacher;

import java.util.List;

public class NewTeacherService implements UserService<Teacher>{
    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return null;
    }

    @Override
    public void removeUser(String fullName) {

    }
}
