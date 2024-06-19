package C06EtcClass;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

public class C0602Calendar {
    public static void main(String[] args) {
//        // java.util 패키지의 Calendar 클래스 (KST : 한국시간, UTC : 세계표준시간)
//        Calendar calendar1 = Calendar.getInstance();
//        System.out.println(calendar1.getTime()); // Tue Jun 18 10:19:28 KST 2024
//
//        System.out.println(calendar1.get(Calendar.YEAR)); // 2024
//        System.out.println(calendar1.get(Calendar.MONTH)+1); // 5 (+1해줘야 정확함)
//        System.out.println(calendar1.get(Calendar.DAY_OF_MONTH)); //18
//        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK)); //3
//        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY)); // 10
//        System.out.println(calendar1.get(Calendar.MINUTE));// 24
//        System.out.println(calendar1.get(Calendar.SECOND)); //28

//        // java.time 패키지 : Local~ 클래스
//        // 날짜(LocalDate)-date타입, 시간(LocalTime), 날짜와 시간(LocalDateTime)-datetime타입
//        LocalDate presentDate = LocalDate.now();
//        System.out.println(presentDate); // 2024-06-18
//        System.out.println(presentDate.getYear()); // 2024
//        System.out.println(presentDate.getMonth()); // JUNE
//        System.out.println(presentDate.getDayOfMonth()); // 18
//        System.out.println(presentDate.getDayOfWeek()); // TUESDAY
//        System.out.println(presentDate.getDayOfYear()); // 170

//        LocalTime presentTime = LocalTime.now();
//        System.out.println(presentTime); // 10:34:48.028582900
//        System.out.println(presentTime.getHour()); // 10
//        System.out.println(presentTime.getMinute()); // 34
//        System.out.println(presentTime.getSecond()); // 48

//        LocalDateTime presentDateTime = LocalDateTime.now();
//        System.out.println(presentDateTime); // 2024-06-18T10:40:01.603500500
//        System.out.println(presentDateTime.getDayOfYear()); // 170
//        System.out.println(presentDateTime.getDayOfMonth()); // 18
//        System.out.println(presentDateTime.getDayOfWeek()); // TUESDAY
//        System.out.println(presentDateTime.getYear()); // 2024
//        System.out.println(presentDateTime.getMonth()); // JUNE
//        System.out.println(presentDateTime.getMonthValue()); // 6

//        // 임의로 특정시간을 만들어 내고 싶을 때 : of메서드 사용
//        LocalDate birthDay = LocalDate.of(1999,04,05);
//        System.out.println(birthDay.getYear()); // 1999
//        System.out.println(birthDay.getMonth()); // APRIL
//        System.out.println(birthDay.getDayOfMonth()); // 5
//
        LocalTime birthTime = LocalTime.of(19,04,05);
        LocalDateTime birthDayTime = LocalDateTime.of(2000,11,20,10,14);

        // 매개변수로 크로노필드 enum타입 사용하여 프로그램의 유연성 향상시킬 수 있다.
        System.out.println(birthDayTime.get(ChronoField.YEAR)); // 2000
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR)); // 11
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH)); // 20
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_DAY)); // 10
        // 0 : 오전, 1: 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY)); // 0
        myWatch(LocalDateTime.now(), ChronoField.YEAR); // 연도는 2024 입니다.
        myWatch(LocalDateTime.now(), ChronoField.AMPM_OF_DAY); // 오전입니다.
    }
    static void myWatch(LocalDateTime localDateTime, ChronoField c){
        if(c == ChronoField.YEAR){
            System.out.println("연도는 "+ localDateTime.get(c) + " 입니다.");
        } else if (c == ChronoField.MONTH_OF_YEAR) {
            System.out.println("월은" + localDateTime.get(c) + "입니다.");
        } else if(c == ChronoField.AMPM_OF_DAY){
            if(localDateTime.get(c) == 0){
                System.out.println("오전입니다.");
            }else{
                System.out.println("오후입니다.");
            }
        }
        // 등등...
    }
}
