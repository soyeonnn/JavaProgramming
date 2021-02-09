public class Card {
    public final int suitNumber;  // 카드 모양 (1 - 클로버, 2 - 하트, 3 - 다이아몬드, 4 - 스페이드)
    public final int rankNumber;

    // 생성자
    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    // 변수 suit 의 숫자 값에 해당하는 슈트(suit)를 리턴
    public String getSuit() {
        switch (suitNumber) {
            case 1: return "Clubs";
            case 2: return "Hearts";
            case 3: return "Diamonds";
            case 4: return "Spades";
            default: return "Wrong suit number";
        }
    }

    // 변수 number 의 숫자 값에 해당하는 카드 랭크를 리턴
    public String getRank() {
        switch (rankNumber) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(this.rankNumber);
        }
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }

}
