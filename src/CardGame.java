import java.util.ArrayList;

public class CardGame {

//    USING CLASSES, ARRAY LISTS AND METHODS, CREATE A DECK OF CARDS. YOU SHOULD USE THE FOLLOWING CLASSES
//    CARD GAME
//    CARD



//    CONTAINS AN ARRAYLIST<CARD> FOR THE DECK OF CARDS THAT CONTAINS ALL 52 CARDS.
//    THIS IS CREATED AND POPULATED WHEN THE GAME IS CONSTRUCTED

//    HAS A NAME WHICH IS ALSO DEFINED IN THE CONSTRUCTOR


//    HAS A GET DECK METHOD THAT LISTS OUT THE CARDS IN THE DECK





    //    CONTAINS AN ARRAYLIST<CARD> FOR THE DECK OF CARDS THAT CONTAINS ALL 52 CARDS.
    ArrayList<Card> cardDeck = new ArrayList<>();

    String[] suitArray = {"\u2660", "\u2665", "\u2666", "\u2663"};
    String[] namesArray = {"2","3","4","5","6","7", "8", "9", "10", "J", "Q", "K", "A"};

    public void createDeck() {
       for (int i = 0; i < suitArray.length; i++) {
           for (int j = 0; j < namesArray.length; j++) {
             Card card = new Card(namesArray[j], suitArray[i], j + 2 );

              cardDeck.add(card);
           }
       }

   }


   public void printDeck() {
       for (Card card: cardDeck ) {
           card.printCard();
       }
   }







}
