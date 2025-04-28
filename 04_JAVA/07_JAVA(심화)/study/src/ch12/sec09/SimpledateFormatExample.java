package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale; // 한국 시간대 적용

public class SimpledateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss", Locale.KOREA);
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일", Locale.KOREA);
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));
    }
}
