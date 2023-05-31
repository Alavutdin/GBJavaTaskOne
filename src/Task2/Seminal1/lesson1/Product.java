package Task2.Seminal1.lesson1;

/**
 * Метод назначения полей
 */
public abstract class Product {

    private String kind;
    private int volume;
    private int temp;

/**Конструктор*/
    public Product(String name,  int volume){
        this.kind =name;
        this.volume=volume;
    }
    public Product(String name, int volume, int temp){
        this.kind =name;
        this.volume=volume;
        this.temp=temp;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getVolume() {
        return volume;
    }

    public void setId(int volume) {
        this.volume = volume;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
