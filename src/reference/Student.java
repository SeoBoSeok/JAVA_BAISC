package reference;

public class Student {
    int studendId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int id, String name) {

        studendId = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총 점은 : " + total + " 점 입니다.");
    }

}
