package reference;

public class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student(100, "Kim");
        student1.setKoreanSubject("Korean", 100);
        student1.setMathSubject("Math", 90);

        Student student2 = new Student(101, "Lee");
        student2.setKoreanSubject("Korean", 95);
        student2.setMathSubject("Math", 95);

        student1.showStudentScore();
        student2.showStudentScore();

    }

}
