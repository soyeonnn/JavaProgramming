public class Person {
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    public Person(String name) { this(name,12,0); }

    public Person(String name, int age) { this(name, age,0); }

    public Person(String name, int age, int cashAmount) {
        this.name = name;
        if (age < 0) {
            this.age  = 12;
        } else {
            this.age = age;
        }
        if (cashAmount < 0) {
            this.cashAmount = 0;
        } else {
            this.cashAmount = cashAmount;
        }

    }

    public void setAge(int age) { this.age = age; }

    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setCashAmount(int cashAmount) { this.cashAmount = cashAmount; }

    public int getCashAmount() { return cashAmount; }

    public void setAccount(BankAccount account) { this.account = account; }

    public BankAccount getAccount() { return account; }

    // 송금 메소드
    public boolean transfer(Person to, int amount) {
        return account.transfer(to.getAccount(), amount);
    }

    public boolean transfer(BankAccount to, int amount) {
        return account.transfer(to, amount);
    }

}
