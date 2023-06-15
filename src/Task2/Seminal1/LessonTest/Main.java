package Task2.Seminal1.LessonTest;

public class Main {

    public static void main(String[] args) {
        Vending vending = new Vending();
        Product product1 = new Apple("Apple", 50);


        product1.setName("Apple");
        product1.setAge(500);

        vending.addProduct(product1);
        vending.addProduct(product1);


        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct(50));


}
}
