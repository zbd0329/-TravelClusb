package com.springparc.step01trevelclub.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
    // static 정적 메서드, DataUtil이라는 객체를 인스턴스화 하지 않고도 호출할 수 있다.
    public static String today(String format){
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format((Calendar.getInstance().getTime()));
    }

    //생성자
    public static String today(){
        return today("yyyy.MM.DD");
    }

}
