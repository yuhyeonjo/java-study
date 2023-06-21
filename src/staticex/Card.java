package staticex;

public class Card {

    private static int serialNum = 10000;
    private int cardId;

    public Card() {
        serialNum++;
        cardId = serialNum;
    }


    public int getCardNumber() {
        return cardId;
    }

    public void setCardNumber(int cardId) {
        this.cardId = cardId;
    }
}
