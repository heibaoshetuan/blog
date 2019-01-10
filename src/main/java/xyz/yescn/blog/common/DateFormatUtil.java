package xyz.yescn.blog.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * @author gavin
 * @date 2019-01-10 21:14
 */
public class DateFormatUtil {
    public static String simpleDateFormat(Timestamp date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        return simpleDateFormat.format(date);
    }
}
