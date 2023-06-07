package Task2.Seminal1.Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Vending {
    List<Product> list = new ArrayList<>();


    void addProduct(Product product){
        list.add(product);
    }

    Product getProduct(String name){
        for (Product product : list) {
            if(name.equals(product.getName())){
                return product;
            }
        }
        return null;
    }


}
