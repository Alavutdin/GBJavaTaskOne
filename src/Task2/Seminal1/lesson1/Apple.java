package Task2.Seminal1.lesson1;

public class Apple extends Product{

    public Apple(String king, int volume) {
        super(king, volume);
    }

    @Override
    public String toString() {
        return String.format("Apple: %s, %s",getKind(), getVolume());

    }

}
