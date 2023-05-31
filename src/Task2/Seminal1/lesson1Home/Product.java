package Task2.Seminal1.lesson1Home;

public abstract class Product {

    private String name;
    private int volume;
    private int temperator;

    public Product(String name, int volume, int temperator) {
        this.name = name;
        this.volume = volume;
        this.temperator = temperator;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperator() {
        return temperator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTemperator(int temperator) {
        this.temperator = temperator;
    }
}
