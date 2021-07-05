package clase2.tm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha extends GregorianCalendar {

    public Fecha(int year, int month, int dayOfMonth) {
        super(year, month, dayOfMonth);
    }

    public Fecha() {
    }

    final static String DATE_FORMAT = "dd-MM-yyyy";

    public static boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean verifyDate(String date){

        boolean ok;
        Fecha f=new Fecha();
        f.setLenient(false);
        try {
            f.setTime(new SimpleDateFormat("YYYY-MM-DD").parse(date));
            ok=true;
        } catch (ParseException e) {
            ok=false;
        }
        return ok;

    }

    public Date nextDay(){
        this.add(DAY_OF_MONTH,1);
        return this.getTime();
    }
    @Override
    public String toString() {
        return "Fecha{" +
                "fields=" + Arrays.toString(fields) +
                ", isSet=" + Arrays.toString(isSet) +
                ", time=" + time +
                ", isTimeSet=" + isTimeSet +
                ", areFieldsSet=" + areFieldsSet +
                '}';
    }
}
