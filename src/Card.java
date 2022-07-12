public class Card {


    private final String cardName, suit;
    private final int value;


    public Card(String cardName, String suit, int value) {
        this.cardName = cardName;
        this.suit = suit;
        this.value = value;
    }

    public String getCardName() {
        return cardName;
    }

    public String getSuit() {
        return suit;
    }

    //    HAS AN INT VALUE (2,3,4,5,6,7,8,9,10,11,12,13,14) -> Values are created in createDeck() -> CardGame
    public int getValue() {return value;}


    //    HAS A STRING SUIT.. USE THE UNICODE CHARACTERS OF HEART, CLUB, DIAMOND AND SPADE
    public static String[] suitArray = {"\u2660", "\u2665", "\u2666", "\u2663"};

    //    HAS A STRING SYMBOL (2,3,4,5,6,7,8,9,10,J,Q,K,A)
   public static String[] symbolArray = {"2","3","4","5","6","7", "8", "9", "10", "J", "Q", "K", "A"};



//    HAS A toString METHOD THAT DESCRIBES THE CLASS

 public void printCard() {
     System.out.println("This is the " + cardName + " of " + suit + " and has a value of " + value);
 }






}
