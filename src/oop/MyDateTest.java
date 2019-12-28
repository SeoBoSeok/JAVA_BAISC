package oop;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate myDate = new MyDate();
        myDate.setDay(1);
        myDate.setMonth(1);
        myDate.setYear(2020);

        MyDate myDate2 = new MyDate(29, 12, 2019);

        myDate.showDate();
        myDate2.showDate();

    }

}
