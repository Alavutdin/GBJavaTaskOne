package Task2.Seminal1.LessonTest;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.print(4,6);
    }
}
class Car{
    int x;
    int y;
    void print(int x, int y){
        System.out.println(x+y);
    }

}