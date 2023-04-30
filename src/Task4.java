import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listf = new ArrayList<>();
        ArrayList<String> listn = new ArrayList<>();
        ArrayList<String> listsn = new ArrayList<>();
        ArrayList<String> listage = new ArrayList<>();
        ArrayList<String> listend = new ArrayList<>();
        ArrayList<String> listid = new ArrayList<>();

        String in = scanner.nextLine();
        int id = 0;

        while (!in.equals("q")){
            System.out.println(in);
//            list1.add(in);
//            in=scanner.nextLine();
            String[] st = new String[5];
            st = in.split(" ");
            list1.add(in);
            listf.add(st[0]);
            listn.add(st[1]);
            listsn.add(st[2]);
            listage.add(String.valueOf(Integer.parseInt(st[3])));
            listend.add(st[4]);
            listid.add(String.valueOf(id));
            in = scanner.nextLine();
            id++;
        }



        System.out.println(listf);
        System.out.println(listn);
        System.out.println(listsn);
        System.out.println(listage);
        System.out.println(listend);
        System.out.println(listid);


        int temp = 0;
        boolean flag = true;
        while (flag){
            for (int g = 0; g < listage.size()-1; g++) {
                if (!(listage.get(g + 1) == listage.get(g))) {
                    temp = Integer.parseInt(listage.get(g));
                    listage.set(g, listage.get(g + 1));
                    listage.set(g + 1, String.valueOf(temp));
                    temp = Integer.parseInt(listage.get(g));
                    listage.set(g, listage.get(g + 1));
                    listage.set(g + 1, String.valueOf(temp));
                    flag = true;

                }
            }
        }
        for (var a:listid) {
            System.out.println(list1.get(Integer.parseInt(a)));
        }


    }

    private static void sortIndexByInt(ArrayList<Integer>arrayToSort, LinkedList<Integer> ind){
        ArrayList<Integer>arr= new ArrayList<>(arrayToSort);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size()-1; j++) {
                if (arr.get(j)>arr.get(j+1)){
                    int tmp = ind.get(j);
                    ind.set(j, ind.get(j+1));
                    ind.set(j+1,tmp);

                    tmp=arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1,tmp);

                }
            }

        }
    }
}
