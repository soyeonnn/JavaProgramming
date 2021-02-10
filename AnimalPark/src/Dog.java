public class Dog extends AbstractAnimal{

    public Dog() { super("개"); }

    @Override
    public void cry() {
        System.out.println("왈왈");
    }
}
