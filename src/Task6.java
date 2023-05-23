import java.util.*;

/*Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.*/

public class Task6 {
    public static void main(String[] args) {
        mySet mySet = new mySet();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };

        myTreeSet myTreeSet = new myTreeSet(comparator);

//      mySet.add(7);
        for (int i = 0; i < 5; i++) {
            mySet.add(new Random().nextInt(10));
            myTreeSet.add(new Random().nextInt(10));
        }
//        System.out.println(myTreeSet.getString());
//
//        System.out.println(myTreeSet.gettkey(3));


        System.out.println(mySet.contains(7));
        System.out.println(Arrays.toString(mySet.toArray())); //
        Iterator<Integer> iterator= myTreeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+", ");
        }

        System.out.println();
        System.out.println(mySet.getItem(2));// Читаем элемент
    }

}
    class mySet{
    //    private ArrayList<Integer>list=new ArrayList<>();
    //    public boolean add(int number){
    //        if (!list.contains(number)){
    //            list.add(number);
    //            return true;
    //        }
//        return false;
//    }

    static final Object OBJECT=new Object();
    private LinkedHashMap<Integer, Object > map = new LinkedHashMap<>();


    public boolean add(int num){
//    HashSet<Integer>integers;
        return map.put(num,OBJECT)==null;
    }

    public boolean contains(int num){

        return map.containsKey(num);
    }

    public Object[] toArray(){

        return map.keySet().toArray();
    }
    public Iterator<Integer>iterator(){

        return map.keySet().iterator();
    }
    public Integer getItem(int index){
        return (Integer) toArray()[index];
    }


}
class myTreeSet{

    private static HashMap<Object, Object> hashMap;
    private Comparator<Integer> comparator;

    public myTreeSet(Comparator<Integer> comp){
        comparator = comp;
    }
    private TreeMap<Integer, Object > treeMap=new TreeMap<>(comparator);
    static final Object OBJECT=new Object();
//    private TreeMap<Integer, Object > treeMap = new TreeMap<>(comparator);

//    static int gettkey(int num) {
//        return (Integer)hashMap.keySet().toArray()[num];
//    }
//
//    static String getString(){
//        return hashMap.keySet().toString();
//    }
    public boolean add(int num){
//    HashSet<Integer>integers;
        return treeMap.put(num,OBJECT)==null;
    }

    public boolean contains(int num){

        return treeMap.containsKey(num);
    }

    public Object[] toArray(){

        return treeMap.keySet().toArray();
    }
    public Iterator<Integer>iterator(){

        return treeMap.keySet().iterator();
    }
    public Integer getItem(int index){
        return (Integer) toArray()[index];
    }


}
