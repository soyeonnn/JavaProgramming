import java.util.ArrayList;

public class GradeCalculator {
    // 변수 선언 (이름, 이전학기 점수, 이전학기 크레딧 수)
    private String name;
    private double prevScore;
    private int prevCredit;
    private ArrayList<Course> courses = new ArrayList<>();

    // 생성자
    public GradeCalculator(String name, double prevScore, int prevCredit) {
        this.name = name;
        this.prevScore = prevScore;
        this.prevCredit = prevCredit;
    }

    public double getPrevScore() { return prevScore; }

    public int getPrevCredit() { return prevCredit; }

    // 수업 추가 함수
    public void addCourse(Course course) {
        courses.add(course);
    }

    // 이번 학기 성적 계산 함수
    public double[] getThisScore() {
        int sumCredit = 0;
        double sumScore = 0.0;
        double thisScore = 0.0;
        double returnScore = 0.0;
        double[] returnList = new double[3];

        for (Course course : courses) {
            sumCredit += course.getCredit();
            sumScore += course.getScore() * course.getCredit();
        }

        thisScore = sumScore / sumCredit;
        returnScore = Double.parseDouble(String.format("%.10f", thisScore));

        returnList[0] = returnScore;
        returnList[1] = sumCredit;
        returnList[2] = sumScore;

        return returnList;
    }

    // 전체 예상 성적 계산 함수
    public void getAllScore() {
        double[] thisScore = getThisScore();
        int allCredit = (int) (thisScore[1]) + prevCredit;
        double allScore = getThisScore()[2] + (prevScore * prevCredit);
        double allGrade = allScore / allCredit;
        double returnScore = Double.parseDouble(String.format("%.10f", allGrade));

        System.out.println("전체 예상 학점: " + returnScore + " (총 " + allCredit  + "학점)");
    }

    public void print() {
        System.out.println("직전 학기 성적: " + prevScore + " (총 " + prevCredit  + "학점)");
        System.out.println("이번 학기 성적: " + getThisScore()[0] + " (총 " + (int)(getThisScore()[1])  + "학점)");
        getAllScore();
    }


}
