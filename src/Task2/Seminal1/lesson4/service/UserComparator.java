package Task2.Seminal1.lesson4.service;

import java.util.Comparator;
import Task2.Seminal1.lesson4.model.User;

public class UserComparator<T extends User> implements Comparator<T> {
    public UserComparator() {
    }

    public int compare(T o1, T o2) {
        String familyName1 = o1.getFullName().split("\\s+")[1];
        String familyName2 = o2.getFullName().split("\\s+")[1];
        return familyName1.compareTo(familyName2);
    }
}