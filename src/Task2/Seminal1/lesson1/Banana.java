package Task2.Seminal1.lesson1;

public class Banana extends Product{
    public Banana(String king, int volume) {
        super(king, volume);
    }
    @Override
    public String toString() {
        return String.format("Banana: %s, %s",getKind(), getVolume());

    }
}
