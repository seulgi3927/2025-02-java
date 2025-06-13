package blackjack;

public class Card {
    private String pattern;
    private String denomination;
    // private 는 같은 클래스에서만 접근가능
    // 따라서 값을 주려면 우회하는 방법이 필요하다
    // 그래서 카드를 생성자로 만들어준다.
    public Card(String pat, String den) {
        this.pattern = pat;
        this.denomination = den;


    }

    public String getPattern(){
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;

    }
    @Override
    public String toString() {
        return String.format("%s (%s)", this.pattern, this.denomination);
    }
    public Card getCard(){
        return getCard();
    }

}


// 생성자라 메소드 차이, 다른 2가지
// 생성자는 리턴타입 없음
// 생성자명은 클래스명과 같다

// 생성자는 왜 만들어요?
// 객체를 생성하고 객체 값을 초기화를 위해

// 기본생성자
// 객체가 생성될때 가장 먼저 호출되는 생성자.
// 명시하지 않아도 컴파일러가 알아서 넣어준다. (다른 생성자가 없을때만)
