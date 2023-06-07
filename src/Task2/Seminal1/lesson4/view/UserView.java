package Task2.Seminal1.lesson4.view;


import Task2.Seminal1.lesson4.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String var1);

    void create(String var1, Integer var2, String var3);

    void removeUser(String var1);
}
