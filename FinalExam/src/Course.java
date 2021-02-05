public class Course {
    // 전공과목과 교양과목 credit 수를 final 로 미리 선언
    static final int CREDIT_MAJOR = 3;
    static final int CREDIT_GENERAL = 2;

    // course 클래스의 변수 (코스 이름, 크레딧수, 점수)
    private String courseName;
    private int credit;
    private double score;

    // 생성자
    public Course(String courseName, int credit, String grade) {
        this.courseName = courseName;
        this.credit = credit;
        this.score = gradeToScore(grade);
    }

    public double getScore() { return score; }

    public int getCredit() { return credit; }

    // grade 를 score 로 바꿔주는 함수
    public double gradeToScore(String grade) {
        if (grade.equals("A+")) {
            return 4.5;
        } else if (grade.equals("A")) {
            return 4.0;
        } else if (grade.equals("B+")) {
            return 3.5;
        } else if (grade.equals("B")) {
            return 3.0;
        } else if (grade.equals("C+")) {
            return 2.5;
        } else if (grade.equals("C")) {
            return 2.0;
        } else if (grade.equals("D+")) {
            return 1.5;
        } else if (grade.equals("D")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

}
