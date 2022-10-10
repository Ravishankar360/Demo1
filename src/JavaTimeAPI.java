import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class JavaTimeAPI {
    public static void main (String [] args){
        LocalDate cld = LocalDate.now();
        System.out.println("Current date" +cld);

        LocalDate zonedate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Zone date" +zonedate);

        LocalDate frombasedate = LocalDate.ofEpochDay(365);
        System.out.println(" 365'th day From base date" +frombasedate);

        LocalDate day2021 = LocalDate.ofYearDay(2021,90);
        System.out.println("90th day of years date" +day2021);

        LocalDate dayof_month = LocalDate.of(2018,Month.APRIL,23);
        System.out.println("day month" +dayof_month);

    }
}
