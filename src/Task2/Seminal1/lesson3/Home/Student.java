package Task2.Seminal1.lesson3.Home;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
}
