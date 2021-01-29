public class BankDriver {
    public static void main(String[] args) {
        // 사람 1
        Person p1 = new Person("김신의", 28, 30000);

        // 사람 2
        Person p2 = new Person("문종모", 25,10000);

        // 은행 계좌 1
        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);

        // 사람1에 계좌1 연결
        p1.setAccount(a1);

        // 은행 계좌 2
        BankAccount a2 = new BankAccount(500000, p2);

        // 사람2에 계좌2 연결
        p2.setAccount(a2);

        // 계좌 이체 테스트
        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);
    }
}
