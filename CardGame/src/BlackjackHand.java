import java.util.ArrayList;

public class BlackjackHand extends Deck {

    // 핸드의 가치를 리턴
    public int getValue() {
        ArrayList<Card> cards = getCards();
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {
            value += ((BlackjackCard) card).getValue();

            if (((BlackjackCard) card).isAce()) {
                aceCount++;
            }
        }

        while (aceCount > 0 && value > 21) {
            value -= 10;
            aceCount--;
        }

        return value;
    }

    // 핸드가 파산했는지 알려주는 함수
    public boolean isBusted() {
        return getValue() > 21;
    }

    // 현재 핸드가 블랙잭인지 리턴해주는 함수
    public boolean isBlackjack() {
        return getCards().size() == 2 && getValue() == 21;
    }
}
