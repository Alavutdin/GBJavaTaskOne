package Task2.Seminal1.lesson4.controller;

import Task2.Seminal1.lesson4.model.Teacher;
import Task2.Seminal1.lesson4.service.TeacherService;
import Task2.Seminal1.lesson4.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    public UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void create(String fullName, Integer age, String phoneNumber) {
        this.teacherService.create(fullName, age, phoneNumber);
    }

    public List<Teacher> getAllSortUsers() {
        return this.teacherService.getAllSortUsers();
    }

    public List<Teacher> getAllSortUsersByFamilyName() {
        return this.teacherService.getAllSortUsersByFamilyName();
    }

    public boolean removeUser(String fullName) {
        this.teacherService.removeUser(fullName);
        return true;
    }

    public List<Teacher> getAll() {
        return this.teacherService.getAll();
    }

    public List<Teacher> getAllSortUsersByAge() {
        return this.teacherService.getAllSortUsersByAge();
    }
}
