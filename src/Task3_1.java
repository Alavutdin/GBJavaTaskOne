import java.util.*;

public class Task3_1 {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(list));
        mergeSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> new_list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(generateRandomInt(20));
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 != 0) {
                new_list.add(list.get(j));
            }
        }
        System.out.println(list);
        System.out.println(new_list);
    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public class Task_3_3 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(generateRandomInt(20));
            }
            double average = 0;
            for (int i = 0; i < list.size(); i++) {
                average += list.get(i);
            }
            System.out.println(list);
            System.out.println("Минимальный элемент: " + Collections.min(list));
            System.out.println("Максимальный элемент: " + Collections.max(list));
            System.out.println("Среднее значение: " + average / list.size());
        }

        public static int generateRandomInt(int upperRange) {
            Random random = new Random();
            return random.nextInt(upperRange);
        }
    }
}
