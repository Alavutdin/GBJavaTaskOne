package Task2.Seminal1.LessonTest;

import java.util.ArrayList;
import java.util.List;

public class Vending {
    private List<Product>list;

    public Vending() {
        list = new ArrayList<>();;
    }

    void addProduct(Product product){
        list.add(product);
    }

    Product getProduct(String name){
        for (Product product : list) {
            if (name.equals(product.getName())){
                return product;
            }
        }
        return null;
    }
    Product getProduct(int age){
        for (Product product : list) {
            if (age== product.getAge()){
                return product;
            }
        }
        return null;
    }

}
