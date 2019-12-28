package classpart;

class ProblemPerson {
    public int age;
    public String name;
    public boolean isMarried;
    public int children;
}


public class Problem1 {

    public static void main(String[] arg) {

        ProblemPerson person = new ProblemPerson();

        person.age = 24;
        person.name = "Stella";
        person.isMarried = true;
        person.children = 1;

        System.out.println("나이 : " + person.age);
        System.out.println("이름 : " + person.name);
        System.out.println("결혼여무 : " + person.isMarried);
        System.out.println("자녀 : " + person.children);
    }

}
