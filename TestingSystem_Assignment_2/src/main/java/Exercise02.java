import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Exercise02 {
    public static void question01() {
        int i = 5;
        System.out.printf("%d",i);
    }

    public static void question02() {
        int i = 100000000;
        System.out.printf("%,d",i);
    }

    public static void question03() {
        float i = 5.567098f;
        System.out.printf("%5.4f",i);
    }

    public static void question04() {
        String a = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"" + a + "\" và tôi đang độc thân");
    }

    public static void question05() {
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }


    public static void main(String[] args) {
//        question01();
//        question02();
//        question03();
//        question04();
        question05();
    }
}
