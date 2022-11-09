package cn.itcast.date_时间API;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

/*
第三代：
    LocalDate、LocalTime、LocalDateTime
    ZoneId和ZonedDateTime
    持续日期/时间：Period和Duration
 */
public class TestThree {
    @Test
    public void test01() {
        LocalDate date = LocalDate.now();
        System.out.println(date); // 获取今天的日期 2022-10-20

        LocalDate kai = LocalDate.of(2022, 10, 20);//指定
        System.out.println(kai);
    }

    @Test
    public void test02() {
        LocalTime now = LocalTime.now();
        System.out.println(now); // 获取现在的时间 15:52:15.543

        LocalTime of = LocalTime.of(12, 0, 0);//指定
        System.out.println(of);
    }

    @Test
    public void test03() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 获取现在的日期和时间 2022-10-20T15:54:01.269

        LocalDateTime of = LocalDateTime.of(2022, 10, 20, 12, 0, 0);//指定
        System.out.println(of);
    }

    @Test
    public void test04() {
        int day = LocalDate.now().getDayOfMonth();
        System.out.println(day); // 20 当前月份对应的日

        int days = LocalDate.now().getDayOfYear();
        System.out.println(days);// 293 当前年份对应的日
    }

    @Test
    public void test05() {
        LocalDate today = LocalDate.now();
        LocalDate date2 = today.withDayOfMonth(25);
        System.out.println(today); // 2022-10-20
        System.out.println(date2); // 2022-10-25
    }

    @Test
    public void test06(){
        LocalDate today = LocalDate.now();
        System.out.println(today.isLeapYear());//false 是否是闰年
    }

    @Test
    public void test07(){
        // Set是一个集合，是一个容器，装对象
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }
    }

    @Test
    public void test08(){
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(now);
//        2022-10-20T01:11:32.928-07:00[America/Los_Angeles]
    }

    @Test
    public void test09(){
        LocalDate today = LocalDate.now();
        LocalDate kai = LocalDate.of(2022, 2, 4);
        Period period = Period.between(today, kai);//间隔多少天
        System.out.println(period);//P-8M-16D 8月16天
    }

    @Test
    public void test10(){
        LocalDate today = LocalDate.now();
        LocalDate kai = LocalDate.of(1992, 5, 1);
        Period period = Period.between(today, kai);//间隔多少天
        System.out.println(period);//P-30Y-5M-19D 30年5个月19天
    }

    @Test
    public void test11(){
        LocalTime now = LocalTime.now();
        LocalTime of = LocalTime.of(12, 0, 0);
        Duration d = Duration.between(now, of);
        System.out.println(d);//PT-4H-20M-21.698S  4小时20分21秒...
    }

    @Test
    // 格式化
    public void test12(){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(df.format(now)); // 2022-10-20T16:25:06.99 T表示Time
    }

    @Test
    public void test13(){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(df.format(now)); // 22-10-20 下午4:27

        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(df2.format(now)); // 2022-10-20 16:27:51

        DateTimeFormatter df3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        System.out.println(df3.format(now)); // 2022年10月20日 下午04时28分14秒

//        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);//Unable to extract value: class java.time.LocalDateTime
        DateTimeFormatter df4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.systemDefault());//传入时区
        System.out.println(df4.format(now)); // 2022年10月20日 星期四 下午04时29分37秒 CT

        DateTimeFormatter df5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withZone(ZoneId.of("America/Los_Angeles"));//传入时区
        System.out.println(df5.format(now)); // 2022年10月20日 星期四 下午04时30分48秒 PT
    }

    @Test
    public void test14(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(now)); // 2022-10-20 16:32:20
    }
}
