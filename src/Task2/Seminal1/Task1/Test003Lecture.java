package Task2.Seminal1.Task1;

import java.util.ArrayList;

public class Test003Lecture {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);
        o =1.2;
        GetType(o);
        System.out.println(Sum(1,2));

        // Массивы
        int [] a =new int[] {1,9};
        int [] b = new int [3];
        System.arraycopy(a,0,b,0,a.length);
        for (int i: a) {
            System.out.printf("%d",i); //0
        }
        for (int j: a) {
            System.out.printf("%d",j);
        }

        // Удобный массив
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2809);

        for (Object ob :list) {
            System.out.println(" "+ob);
        }

    }
    static Object Sum(Object a, Object b){
        if (a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double)b);
        }else return 0;
    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }

}
