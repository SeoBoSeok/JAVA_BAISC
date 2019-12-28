package oop;

public class TakeTransportTest {

    public static void main(String[] args) {
        Student student1 = new Student("James", 15000);
        Student student2 = new Student("Tom", 17000);

        Bus bus = new Bus(100);
        Subway subway = new Subway(2);

        student1.takeBus(bus);
        student2.takeSubway(subway);
        student2.takeBus(bus);

        student1.showInfo();
        student2.showInfo();
        bus.showBusInfo();
        subway.showSubwayInfo();

    }

}
