package Task2.Seminal1.lesson5.lesson4.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private final Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
}