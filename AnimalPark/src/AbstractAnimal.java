public abstract class AbstractAnimal {
    public final String name;

    // 생성자
    public AbstractAnimal(String name) {
        this.name = name;
    }

    // 동물의 울음 소리를 출력하는 추상 메소드
    public abstract void cry();
}
