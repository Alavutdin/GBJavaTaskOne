package Task2.Seminal1.lesson4;


import Task2.Seminal1.lesson4.controller.TeacherController;
import Task2.Seminal1.lesson4.repository.TeacherRepository;
import Task2.Seminal1.lesson4.service.TeacherService;
import Task2.Seminal1.lesson4.view.TeacherView;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        TeacherView view = getTeacherView();
        view.create("Sergey Morozov", 25, "02");
        view.create("Oly Vorobeva", 50, "03");
        view.create("Oleg Sidorov", 30, "112");
        view.sendOnConsole("none");
        view.create("Elena Ivanova", 48, "911");
        view.create("Ekaterina Morozova", 36, "01");
        view.sendOnConsole("none");
        view.sendOnConsole("user_name");
        view.sendOnConsole("family_name");
        view.sendOnConsole("age");
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
