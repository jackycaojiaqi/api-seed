package com.company.project.util;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jacky on 2017/9/28.
 */
public class StringUtil {



    public static boolean hasDigit(String content) {
        boolean flag = false;
        Pattern p = Pattern.compile(".*\\d+.*");
        Matcher m = p.matcher(content);
        if (m.matches())
            flag = true;
        return flag;
    }

    /**
     * 判断字符串是否为空
     *
     * @param s
     * @return
     */
    public static boolean isEmptyandnull(String s) {
        return s == null || s.trim().length() == 0 || s.equals("null");
    }

    /**
     * 时间格式优化
     *.
     * @param s
     * @return
     */
    public static String getTimeFormat(String s) {
        if (s == null || s.trim().length() == 0 || s.equals("null")){
            return " ";
        }
        s = s.substring(0,19);
        s =s.replace("T"," ");
        return s;
    }
    /**
     * 保留3位小数
     * .
     *
     * @param s
     * @return
     */
    public static String getDoubleTo3String(double s) {
        BigDecimal b = new BigDecimal(s);
        double f1 = b.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
        return String.valueOf(f1);
    }

}
