package Task2.Seminal1.LessonTest;

public class Apple extends Product{
    public Apple(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return String.format("Apple: %s,%s", getName(),getAge());
    }
}
