public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(Person newPerson) {
        owner = newPerson;
    }

    public Person getOwner() {
        return owner;
    }

    // 입금 메소드
    public boolean deposit(int amount) {
        if (amount < 0 || amount > owner.getCashAmount()) {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }

        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);

        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    public boolean deposit(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }

    // 출금 메소드
    boolean withdraw(int amount) {
        if (amount < 0 || balance < amount) {
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }

        balance -= amount;
        owner.setCashAmount(owner.getCashAmount() + amount);

        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }

    // 송금 메소드
    public boolean transfer(BankAccount to, int amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("false - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
            return false;
        }

        balance -= amount;
        to.balance += amount;
        System.out.println("true - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
        return true;
    }

    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(),amount);
    }
}
