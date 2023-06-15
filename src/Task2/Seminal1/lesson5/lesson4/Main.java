package Task2.Seminal1.lesson5.lesson4;

import Task2.Seminal1.lesson5.lesson4.controller.StudentController;
import Task2.Seminal1.lesson5.lesson4.model.Student;
import Task2.Seminal1.lesson5.lesson4.model.StudentGroup;
import Task2.Seminal1.lesson5.lesson4.repository.StudentRepository;
import Task2.Seminal1.lesson5.lesson4.service.StudentService;
import Task2.Seminal1.lesson5.lesson4.view.SortType;
import Task2.Seminal1.lesson5.lesson4.view.StudentView;
import Task2.Seminal1.lesson5.lesson4.view.UserView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

}
