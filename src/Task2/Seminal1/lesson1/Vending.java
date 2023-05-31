package Task2.Seminal1.lesson1;

import java.util.*;

public class Vending {
    /**
     * Первый метод ArrayList<>()
     * Метод add
     * Метод сравнения
     */

    private final List<Product> list;
    /**Метод будет принимать экземпляры продукта*/
    public Vending(){

        list= new ArrayList<>();
    }
    /**Метод добавления продукта*/
    void addProduct(Product product){

        list.add(product);
    }

    /**Метод сравнения продукта*/
    Product getProduct(String kind){
        for (Product product : list) {
            if (kind.equals(product.getKind())){
                return product;
            }
        }
        return null;
    }
    /** Метод перегрузки изменяя аргументы*/
    Product getProduct(int temp){
        for (Product product : list) {
            if (temp== product.getTemp()){
                return product;
            }
        }
        return null;
    }

}
