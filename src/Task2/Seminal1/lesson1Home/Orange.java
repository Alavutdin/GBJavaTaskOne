package Task2.Seminal1.lesson1Home;

public class Orange extends Product{
    public Orange(String name, int volume, int temperator) {
        super(name, volume, temperator);
    }

    public String toString() {
        return String.format("Orange: %s,%s,%s",getName(),getTemperator(),getVolume());
    }
}
