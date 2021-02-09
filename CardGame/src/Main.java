public class Main {
    public static void main(String[] args) {
        /* 카드 셔플러
        // 52장 스탠다드 카드 덱 생성
        Deck standardDeck = new Deck();

        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(suit, rank);

                standardDeck.addCard(newCard);
            }
        }

        // 카드 셔플
        standardDeck.shuffle();

        // 딜링
        Deck hand1 = standardDeck.deal(5);
        Deck hand2 = standardDeck.deal(5);

        // 각 핸드 출력
        hand1.print();
        System.out.println("----------");
        hand2.print(); */

        /* 블랙잭 1
        BlackjackCard card1 = new BlackjackCard(1, 1);
        BlackjackCard card2 = new BlackjackCard(2, 6);
        BlackjackCard card3 = new BlackjackCard(4, 12);

        System.out.println(card1.getValue());
        System.out.println(card1.isAce());
        System.out.println(card2.getValue());
        System.out.println(card2.isAce());
        System.out.println(card3.getValue());
        System.out.println(card3.isAce()); */

        BlackjackHand hand1 = new BlackjackHand();
        hand1.addCard(new BlackjackCard(3, 1));
        hand1.addCard(new BlackjackCard(4, 11));
        System.out.println(hand1.getValue());
        System.out.println(hand1.isBlackjack());
        System.out.println(hand1.isBusted());

        BlackjackHand hand2 = new BlackjackHand();
        hand2.addCard(new BlackjackCard(1, 4));
        hand2.addCard(new BlackjackCard(2, 8));
        hand2.addCard(new BlackjackCard(2, 9));
        System.out.println(hand2.getValue());
        System.out.println(hand2.isBlackjack());
        System.out.println(hand2.isBusted());

        BlackjackHand hand3 = new BlackjackHand();
        hand3.addCard(new BlackjackCard(2, 5));
        hand3.addCard(new BlackjackCard(4, 9));
        hand3.addCard(new BlackjackCard(2, 13));
        System.out.println(hand3.getValue());
        System.out.println(hand3.isBlackjack());
        System.out.println(hand3.isBusted());

        BlackjackHand hand4 = new BlackjackHand();
        hand4.addCard(new BlackjackCard(2, 8));
        hand4.addCard(new BlackjackCard(1, 1));
        System.out.println(hand4.getValue());
        System.out.println(hand4.isBlackjack());
        System.out.println(hand4.isBusted());

        BlackjackHand hand5 = new BlackjackHand();
        hand5.addCard(new BlackjackCard(1, 7));
        hand5.addCard(new BlackjackCard(1, 9));
        hand5.addCard(new BlackjackCard(3, 1));
        System.out.println(hand5.getValue());
        System.out.println(hand5.isBlackjack());
        System.out.println(hand5.isBusted());

        BlackjackHand hand6 = new BlackjackHand();
        hand6.addCard(new BlackjackCard(2, 1));
        hand6.addCard(new BlackjackCard(1, 1));
        System.out.println(hand6.getValue());
        System.out.println(hand6.isBlackjack());
        System.out.println(hand6.isBusted());
    }
}