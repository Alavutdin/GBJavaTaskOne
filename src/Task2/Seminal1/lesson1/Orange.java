package Task2.Seminal1.lesson1;

public class Orange extends Product{
    public Orange(String king, int volume) {
        super(king, volume);
    }
    @Override
    public String toString() {
        return String.format("Orange: %s, %s",getKind(), getVolume());

    }
}
