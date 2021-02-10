import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("동물원에 어떤 동물을 키울까요?");
            String name = s.next();
            System.out.println(name + "의 울음소리는 어떤가요?");
            String sound = s.next();

            // 사용자 입력으로 받은 동물 클래스를 만들어 넣어봅시다.
            animals.add(new AbstractAnimal(name) {
                @Override
                public void cry() {
                    System.out.println(sound);
                }
            });
        }

        // 동물 이름 출력
        System.out.println("코드잇 동물원 보유 동물들");
        for (AbstractAnimal animal : animals) {
            System.out.println(animal.name);
            animal.cry();
        }
    }
}