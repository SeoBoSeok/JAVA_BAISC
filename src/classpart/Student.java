package classpart;

class Test { // 물론 JAVA file안에 다른 클래스가 들어가도 된다

}

public class Student { // Class 이름은 JAVA 파일 이름과 동일하게 해야한다. public 키워드의 클래스는 JAVA file안에서 유일하게 하나만 있어야 한다
    public int studentId; // 멤버변수
    public String studentName; // 멤버변수
    public String address; // 멤버변수

    public void showStudentInfo() { // 멤버함수, 메소드
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
