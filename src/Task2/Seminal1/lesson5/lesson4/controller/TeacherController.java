package Task2.Seminal1.lesson5.lesson4.controller;

import Task2.Seminal1.lesson5.lesson4.model.Teacher;
import Task2.Seminal1.lesson5.lesson4.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final UserService<Teacher> teacherService;

    public TeacherController(UserService<Teacher> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

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
    public boolean removeUser(String fullName) {
        return false;
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return null;
    }
}
