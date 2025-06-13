package blackjack;

import static java.util.Collections.shuffle;

public class CardDeck {
    private String[] patterns = {"♥", "◆", "♣", "♠"};
    // cards는 카드객체 52개의 주소값을 저장한 친구한테 접근할 수 있다.
    private Card[] cards = new Card[52];
    private int selectedIdx = 0;


    // 기본 생성자 작성
    public CardDeck() {
        int index = 0;
        for(int i=0; i<patterns.length; i++) { // 4

            for(int k=1; k<=13; k++) { // 13
                String deno = switch (k) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(k);
                };
                cards[index++] = new Card(patterns[i], deno);
            }
        }
        shuffle(); // 내부적으로 사용하는
    }

    private void shuffle(){
        // 카드 객체 순서 섞어주세요.
        for(int i=0; i<cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            Card temp = cards[rIdx];
            cards[rIdx] = cards[i];
            cards[i] = temp;
        }

//        for(int i=1; i<=cards.length; i++){
//            int j = (int)(Math.random()*52);
//            Card temp = cards[i];
//                cards[i] = cards[j];
//               cards[j] = temp;
//        }

    }

    public void printAllCards() {
        for(Card card : cards) {
           // System.out.printf("%s (%s)\n", card.getPattern(), card.getDenomination());
            System.out.println(card);
        }
    }
    @Override //에노데이션
    public String toString() {
        return  "나는 카드덱이야";
    }

    public Card getCard() {
        if(selectedIdx == cards.length) {
            return null;
        }
        Card c = cards[selectedIdx];
        cards[selectedIdx++] = null;
        return c;

    }
}

// 각 방은 어떤 값만 들어갈 수 있는가? String, int, Card객체주소값

// 모든 방에 모두 다른 주소값을 넣는다.

// 각 카트가 가지고 있는 값도 모두 달라야 합니다.
// 패턴은 Spade, Heart, Diamond, Clover
// 디노미네이션 A,2,3,4,5,6,7,8,9,10,J,Q,K
// 13장 패턴은 모두 Spade, Heart, Diamond, Clover