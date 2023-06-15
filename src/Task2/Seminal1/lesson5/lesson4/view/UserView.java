package Task2.Seminal1.lesson5.lesson4.view;

import Task2.Seminal1.lesson5.lesson4.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType); //GET
    void create(String fullName, Integer age, String phoneNumber); //POST
    void removeUser(String fullName); //DELETE
}