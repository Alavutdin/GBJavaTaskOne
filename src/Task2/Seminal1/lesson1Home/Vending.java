package Task2.Seminal1.lesson1Home;

import java.util.ArrayList;
import java.util.List;

// Перегруженный метод
public class Vending {
    private List<Product> list;

    public Vending() {
        list = new ArrayList<>();
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
    Product getProduct(Long volume){
        for (Product product : list) {
            if (volume.equals(product.getVolume())){
                return product;
            }
        }
        return null;
    }

}
