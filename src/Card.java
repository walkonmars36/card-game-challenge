public class Card {

//    HAS A STRING SUIT.. USE THE UNICODE CHARACTERS OF HEART, CLUB, DIAMOND AND SPADE
    private String cardName, suit;
    private int value;

    public Card(String cardName, String suit, int value) {
        this.cardName = cardName;
        this.suit = suit;
        this.value = value;
    }

    public String getCardName() {
        return cardName;
    }


    public void setCardName(String cardName) {
        this.cardName = cardName;


    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }



//    HAS A STRING SYMBOL (2,3,4,5,6,7,8,9,10,J,Q,K,A)

//    HAS AN INT VALUE (2,3,4,5,6,7,8,9,10,11,12,13,14)



//    HAS A toString METHOD THAT DESCRIBES THE CLASS

 public void printCard() {
     System.out.println("This is the " + cardName + " of " + suit + " and has a value of " + value);
 }











}
