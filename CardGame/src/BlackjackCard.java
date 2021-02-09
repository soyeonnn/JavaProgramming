public class BlackjackCard extends Card {
    // 블랙잭 카드 생성자
    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

    // 블랙잭 카드의 가치 리턴
    public int getValue() {
        switch (rankNumber) {
            case 1:
                return 11;
            case 11:
            case 12:
            case 13:
                return 10;
            default:
                return rankNumber;
        }
    }

    // 카드가 Ace 카드인지 확인하는 함수
    public boolean isAce() {
        return rankNumber == 1 ;
    }
}
