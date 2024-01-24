import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        //bnyk deprecated
        Date tanggal = new Date();

        System.out.println(tanggal);

        //versi lanjut
        Calendar calendar = Calendar.getInstance();
        Date result = calendar.getTime();
        System.out.println(result);

        calendar.set(Calendar.YEAR, 20);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result2 = calendar.getTime();
        System.out.println(result2);
    }
}
