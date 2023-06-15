package Task2.Seminal1.LessonTest;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public abstract class Product {
    private String name;
    private int age;

    public Product(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    public Product(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
