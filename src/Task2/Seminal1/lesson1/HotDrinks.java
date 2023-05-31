package Task2.Seminal1.lesson1;

public class HotDrinks extends Product{


    public HotDrinks(String name, int volume){
        super(name,volume);
    }

    public HotDrinks(String name, int volume, int temp){
        super(name,volume, temp);
    }
    public String toString(){
        return String.format("Apple: %s, %s, %s, %s",getKind(), getVolume(), getTemp());
    }


}
