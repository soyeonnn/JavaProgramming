import java.util.ArrayList;
import java.util.Random;

public class Deck<T extends Card> {
    private ArrayList<T> cards;

    // Deck 생성자
    public Deck() { cards = new ArrayList<T>(); }

    public ArrayList<T> getCards() { return cards; }

    public void addCard(T card) { cards.add(card); }

    // 카드 목록에 있는 모든 카드를 출력
    public void print() {
        for (T card : cards) {
            System.out.println(card.toString());
        }
    }

    // cards 의 순서를 뒤죽박죽 섞기
    public void shuffle() {
        Random random = new Random();
        ArrayList<T> temp = new ArrayList<>(52);

        for (int i=0; i<52; i++) {
            temp.add(cards.remove(random.nextInt(cards.size())));
        }

        cards = temp;
    }

    // count 만큼 카드를 빼서 리턴
    public Deck deal(int count){
        Deck hand = new Deck();

        for (int i=0; i<count; i++) {
            hand.addCard(cards.remove(cards.size()-1));
        }

        return hand;
    }


}
