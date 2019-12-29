package oop.staticVariable;

import java.util.Calendar;
import java.util.Date;

public class CompanyTest {

    public static void main(String[] args) {
        Company company = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company);
        System.out.println(company2);

        Date d = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);

        System.out.println(calendar);

        // 기본적으로 현재날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH));
        // (today.get(Calendar.MONTH) + 1)) 이런 형식으로 하면 다음월을 받아 올 수
        // 있다. today.get(Calendar.MONTH) + 1로 하면 이상한 값이 나온다. (괄호유무)
        System.out.println("월(0~11, 0:1월): " + (today.get(Calendar.MONTH) + 1));
        System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
        // DATE와 DAY_OF_MONTH는 같다.
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
        // 1:일요일, 2:월요일, ... 7:토요일
        System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 몇 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
        // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
        System.out.println("TimeZone(-12~+12): " +
                (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        // 이 달의 마지막 일을 찾는다.
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE) );


        // calendar 예제 2
        Calendar date = Calendar.getInstance();

        date.set(2019, 12, 29);  // 2019년 12월 29일

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 "
                + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일";
    }

}
