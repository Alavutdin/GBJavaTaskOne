package Task2.Seminal1.lesson5.lesson4.service;

import Task2.Seminal1.lesson5.lesson4.model.Student;
import Task2.Seminal1.lesson5.lesson4.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    void removeUser(String fullName);

}
