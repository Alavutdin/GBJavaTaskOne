package Task2.Seminal1.lesson4.view;

import java.util.Iterator;
import java.util.List;
import Task2.Seminal1.lesson4.controller.UserController;
import Task2.Seminal1.lesson4.model.Teacher;

public class TeacherView {
    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    public void sendOnConsole(String sortType) {
        List var10000;
        switch (sortType) {
            case "none":
                var10000 = this.controller.getAll();
                break;
            case "user_name":
                var10000 = this.controller.getAllSortUsers();
                break;
            case "family_name":
                var10000 = this.controller.getAllSortUsersByFamilyName();
                break;
            case "age":
                var10000 = this.controller.getAllSortUsersByAge();
                break;
            default:
                var10000 = null;
        }

        List<Teacher> teachers = var10000;
        if (teachers == null) {
            System.out.println("teacher is null");
        } else {
            System.out.println("=====================");
            Iterator var3 = teachers.iterator();

            while(var3.hasNext()) {
                Teacher teacher = (Teacher)var3.next();
                System.out.println(teacher);
            }

            System.out.println("=====================");
        }
    }

    public void create(String fullName, Integer age, String phoneNumber) {
        this.controller.create(fullName, age, phoneNumber);
    }

    public void removeUser(String fullName) {
        this.controller.removeUser(fullName);
    }
}
