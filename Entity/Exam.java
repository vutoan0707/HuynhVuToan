package Entity;

import java.time.LocalDate;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion[] category;
    int duration;
    Account creator;
    LocalDate createDate;
    Question[] questions;
}
