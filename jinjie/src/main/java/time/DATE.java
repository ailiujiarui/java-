package time;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Set;

public class DATE {
    public  static void main(String arg[]) throws ParseException {


        /*SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日");
        Scanner sc=new Scanner(System.in);
        String birth=sc.nextLine();
       Date d1= s.parse(birth);
        Date d2=new Date();
        long time =d2.getTime()- d1.getTime();
        System.out.println(time/1000.0/60/60/24+"天");*/

        //java7 日历类calendar
 /*System.out.println(ss.get(Calendar.DAY_OF_WEEK));//获取年份
        ss.set(Calendar.YEAR,2099);
        System.out.println(ss.get(Calendar.YEAR));//获取年份
        ss.add(Calendar.YEAR,1);
        System.out.println(ss.get(Calendar.YEAR));//获取年份*/
      /*  Calendar ss=Calendar.getInstance();
        ss.set(2050,2,1);
        if (ss.get(Calendar.DAY_OF_WEEK)!=5){
        System.out.println("不是疯狂星期四");}*/
        /*Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        SimpleDateFormat si=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=si.parse(time);
        Calendar s=Calendar.getInstance();
        s.setTime(d);
        System.out.println(s.get(Calendar.DAY_OF_YEAR));*/

        //java8日历类
       //LocalDateTime lds=LocalDateTime.now();
       /*  *//*LocalDateTime lds2=LocalDateTime.of(2008,12,12,12,12);
        System.out.println(lds.getYear());
        System.out.println(lds.getDayOfYear());*//*
        System.out.println(lds.withYear(2009));
        System.out.println(lds.plusHours(8));
        System.out.println(lds.minusYears(9));
        System.out.println(lds.isAfter(lds.minusYears(10)));
        System.out.println(lds);*/


        //时间格式化类
        /*DateTimeFormatter ds=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(ds.format(lds));*/

        //Instant类
        //System.out.println(Instant.now());
       /* Set<String> set = ZoneId.getAvailableZoneIds();
        System.out.println(set);*/
        /*ZoneId id =ZoneId.systemDefault();
        System.out.println(id);
        id =ZoneId.of("Africa/Nairobi");
        System.out.println(id);*/
      /*  Instant ins1=Instant.ofEpochMilli(111445144);
        Instant ins2 =Instant.now();
        System.out.println(Instant.ofEpochMilli(111445144));
        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));
        System.out.println(ins1.isAfter(ins2));
        System.out.println(ins1.isBefore(ins2));
        System.out.println(ins2.plusSeconds(1100000));
        System.out.println(ins2.minusMillis(44444778));*/

        //ZoneDataTime
        /*ZonedDateTime zd=ZonedDateTime.now();
        System.out.println(ZonedDateTime.of(LocalDate.now(),LocalTime.now(),ZoneId.systemDefault()));
        System.out.println(zd.withYear(2088));
        System.out.println(zd.minusYears(4));
        System.out.println(zd.plusYears(9));*/

       /* LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(2023,2,4);

        Period period =Period.between(d2,d1);
        System.out.println(period.getYears());*/


        Scanner sc=new Scanner(System.in);
        DateTimeFormatter da=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate localDate1 = LocalDate.parse(sc.nextLine(), da);
        LocalDate ld2=LocalDate.now();
        System.out.println("年龄："+ChronoUnit.YEARS.between(localDate1,ld2)+"岁");
    }
}
