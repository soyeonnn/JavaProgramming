public class Main {
    public static void main(String[] args) {
        /* 코드박스 예약
        // Theater 생성
        Theater t = new Theater(5, 9);

        // 좌석 예약
        System.out.println("김신의님 이름으로 A5부터 2개의 좌석 예약: " + (t.reserve("김신의", 'A', 5, 2) ? "성공" : "실패"));
        System.out.println("이윤수님 이름으로 C1부터 3개의 좌석 예약: " + (t.reserve("이윤수", 'C', 1, 3) ? "성공" : "실패"));
        System.out.println("강영훈님 이름으로 D4부터 7개의 좌석 예약: " + (t.reserve("강영훈", 'D', 4, 7) ? "성공" : "실패"));
        System.out.println("문종모님 이름으로 C7부터 3개의 좌석 예약: " + (t.reserve("문종모", 'C', 7, 3) ? "성공" : "실패"));

        // 좌석 취소
        System.out.println("A6부터 좌석 3개 취소: 총 " + t.cancel('A', 6, 3) + "개의 좌석이 취소되었습니다.");
        System.out.println("이윤수님의 좌석 취소: 총 " + t.cancel("이윤수") + "개의 좌석이 취소되었습니다.");

        // 결과 출력
        System.out.println();
        t.printSeatMatrix();
        System.out.println("총 " + t.getNumberOfReservedSeat() + "개의 좌석이 예약되었습니다.");*/

        /* 학점 계산기
        GradeCalculator gradeCalc = new GradeCalculator("김신의", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));

        gradeCalc.print(); */

        Artist keithJarrett = new Artist("Keith Jarrett");

        Album theMelodyAtNightWithYou = new Album("The Melody At Night With You", 1999, keithJarrett);
        theMelodyAtNightWithYou.addTrack(new Song("I Loves You, Porgy", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("I Got It Bad (and That Ain't Good)", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Don't Ever Leave Me", keithJarrett, theMelodyAtNightWithYou));
        theMelodyAtNightWithYou.addTrack(new Song("Someone to Watch over Me", keithJarrett, theMelodyAtNightWithYou));

        Album insideOut = new Album("Inside Out", 2001, keithJarrett);
        insideOut.addTrack(new Song("From the Body", keithJarrett, insideOut));
        insideOut.addTrack(new Song("Inside Out", keithJarrett, insideOut));

        keithJarrett.addAlbum(theMelodyAtNightWithYou);
        keithJarrett.addAlbum(insideOut);

        Artist bts = new Artist("방탄소년단");

        Album darkAndWild = new Album("DARK & WILD", 2014, bts);
        darkAndWild.addTrack(new Song("Intro: What am I to You", bts, darkAndWild));
        darkAndWild.addTrack(new Song("Danger", bts, darkAndWild));

        Album wings = new Album("WINGS", 2016, bts);
        wings.addTrack(new Song("Intro: Boy Meets Evil", bts, wings));
        wings.addTrack(new Song("피 땀 눈물", bts, wings));
        wings.addTrack(new Song("Begin", bts, wings));
        wings.addTrack(new Song("Lie", bts, wings));


        bts.addAlbum(darkAndWild);
        bts.addAlbum(wings);

        System.out.println(keithJarrett.getAlbums().get(0).getTrack(2).toString());
        System.out.println();
        System.out.println(bts.getAlbums().get(1).getTrack(3).toString());
    }
}