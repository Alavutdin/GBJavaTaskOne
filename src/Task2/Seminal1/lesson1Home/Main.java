package Task2.Seminal1.lesson1Home;

/*1. Создать наследника реализованного класса ГорячийНапиток с дополнительным
полем int температура.
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
реализовать перегруженный метод getProduct(int name, int volume, int temperature),
выдающий продукт соответствующий имени, объёму и температуре
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
и воспроизвести логику, заложенную в программе
4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/

public class Main {
    public static void main(String[] args) {



        Vending vending = new FruitVending();

        Product product1=new Apple("Green Apple", 20, 10);
        Product product2=new Orange
                ("Green Apple", 20, 10);
        //product.name="Apple";
        product1.setName("Apple");

        vending.addProduct(product1);
        vending.addProduct(product2);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));

        System.out.println(vending.getProduct(2l));
        System.out.println(vending.getProduct(25l));





    }
}
