package oop;

public class Subway {

    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNumber + "번 지하의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
    }

}
