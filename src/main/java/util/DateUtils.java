package util;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public static boolean isWeekend(@NotNull Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY;
    }
}
