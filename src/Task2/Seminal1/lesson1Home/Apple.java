package Task2.Seminal1.lesson1Home;

public class Apple extends Product{

    public Apple(String name, int volume, int temperator) {
        super(name, volume, temperator);
    }

    @Override
    public String toString() {
        return String.format("Apple: %s,%s,%s",getName(),getTemperator(),getVolume());
    }
}
