import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TestSeminar004 {
    public static void main(String[] args) {
        ArrayList<String> list_1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        while (!in.equals("q")){
            in = scanner.nextLine();
            System.out.println(in);
            list_1.add(in);
        }
//        for (int i = 0; i < 2; i++) {
//            String in = scanner.nextLine();
//            System.out.println(in);
//            list_1.add(in);
//        }
        list_1.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                System.out.println(o1.split(" ")[3]); // Выводит 3 массив
                int o11 = Integer.parseInt(o2.split(" ")[3]);
                return 0;
            }
        });
    }
}
