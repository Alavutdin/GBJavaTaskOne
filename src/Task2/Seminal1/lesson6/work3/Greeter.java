package Task2.Seminal1.lesson6.work3;

import lombok.Setter;

@Setter
public class Greeter {
    private Greeting greeting;

    public Greeter() {
        this.greeting = new GreetingDefault();
    }

    public Greeter(Greeting greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return greeting.greet();
    }

}