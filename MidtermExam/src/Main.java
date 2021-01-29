import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 평균값 계산기
        AverageFinder finder = new AverageFinder();

        // 테스트 1
        int[] testArray1 = {3, 7, 3};
        System.out.println(finder.computeAverage(testArray1));

        // 테스트 2
        int[] testArray2 = {1, 3, 4, 7};
        System.out.println(finder.computeAverage(testArray2));

        // 테스트 3
        int[] testArray3 = {4};
        System.out.println(finder.computeAverage(testArray3));

        // 테스트 4
        int[] testArray4 = {1, 2, 3, 4, 5};
        System.out.println(finder.computeAverage(testArray4)); */

        /* 두 원소의 차 중 최댓값 구하기
        GreatestDifferenceFinder finder = new GreatestDifferenceFinder();

        // 테스트 1
        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDifference(testArray1));

        // 테스트 2
        int[] testArray2 = {8, 3, 14, 1};
        System.out.println(finder.greatestDifference(testArray2));

        // 테스트 3
        int[] testArray3 = {4, 2, 3, 1};
        System.out.println(finder.greatestDifference(testArray3));

        // 테스트 4
        int[] testArray4 = {};
        System.out.println(finder.greatestDifference(testArray4));

        // 테스트 5
        int[] testArray5 = {1, 2, -3, 4, 5};
        System.out.println(finder.greatestDifference(testArray5));

        // 테스트 6
        int[] testArray6 = {1};
        System.out.println(finder.greatestDifference(testArray6)); */

        /* 삼각형 그리기
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10); */

        /* 피라미드 그리기
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10); */

        /* 플로이드의 삼각형
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15); */

        /* 콘솔 입력 받기
        System.out.println("나이가 어떻게 되시나요? ");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("나이는: " + age);

        System.out.println("이름이 어떻게 되시나요? ");
        String name = scanner.next();

        System.out.println(name + "의 나이는: " + age); */

        Scanner scanner = new Scanner(System.in);
        String input;
        String input2;

        while (true) {
            System.out.println("(I)ntro (C)ourses (E)xit");
            input = scanner.next();

            if (input.equals("I") || input.equals("i")) {
                System.out.println("안녕하세요! 우리는 코드잇입니다.");
                System.out.println("함께 공부합시다!");
            } else if (input.equals("C") || input.equals("c")) {
                while (true) {
                    System.out.println("코드잇 수업을 소개합니다.");
                    System.out.println("(P)ython (J)ava (i)OS (B)ack");
                    input2 = scanner.next();

                    if (input2.equals("P") || input2.equals("p")) {
                        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
                        System.out.println("강사: 강영훈");
                        System.out.println("추천 선수과목: 없음");
                    } else if (input2.equals("J") || input2.equals("j")) {
                        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
                        System.out.println("강사: 김신의");
                        System.out.println("추천 선수과목: Python");
                    } else if (input2.equals("I") || input2.equals("i")) {
                        System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
                        System.out.println("강사: 성태호");
                        System.out.println("추천 선수과목: Python, Java");
                    } else if (input2.equals("B") || input2.equals("b")) {
                        break;
                    }
                }
            } else if (input.equals("E") || input.equals("e")) {
                System.out.println("안녕히 가세요.");
                break;
            }

        }

    }
}
