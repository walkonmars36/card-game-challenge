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

    ArrayList<Integer> cardDeck = new ArrayList<Integer>();

    public void createDeck() {
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 14; j++) {
               cardDeck.add(j);
           }
       }

   }







}
