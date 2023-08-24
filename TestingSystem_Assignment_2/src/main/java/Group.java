import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createDate;
    Account[] accounts;

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
