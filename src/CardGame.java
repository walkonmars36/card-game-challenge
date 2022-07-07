import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {

//    USING CLASSES, ARRAY LISTS AND METHODS, CREATE A DECK OF CARDS. YOU SHOULD USE THE FOLLOWING CLASSES
//    CARD GAME
//    CARD


//    HAS A NAME WHICH IS ALSO DEFINED IN THE CONSTRUCTOR




    //    CONTAINS AN ARRAYLIST<CARD> FOR THE DECK OF CARDS THAT CONTAINS ALL 52 CARDS.
    ArrayList<Card> cardDeck = new ArrayList<>();

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    String[] suitArray = {"\u2660", "\u2665", "\u2666", "\u2663"};
    String[] namesArray = {"2","3","4","5","6","7", "8", "9", "10", "J", "Q", "K", "A"};



    public CardGame() {
    }

    //    THIS IS CREATED AND POPULATED WHEN THE GAME IS CONSTRUCTED
    public void createDeck() {
       for (int i = 0; i < suitArray.length; i++) {
           for (int j = 0; j < namesArray.length; j++) {
             Card card = new Card(namesArray[j], suitArray[i], j + 2 );

              cardDeck.add(card);
           }
       }



   }

    //    HAS A GET DECK METHOD THAT LISTS OUT THE CARDS IN THE DECK
   public void printDeck() {
       for (Card card: cardDeck ) {
           card.printCard();
       }
   }



//    Card dealCard() - takes the card from the top of the deck and returns it
  public void dealCard() {

        Card topCard = cardDeck.get(0);
        cardDeck.remove(topCard);
        System.out.println("You have drawn the " + topCard.getCardName() + " of " + topCard.getSuit());


  }

//    ArrayList<Card> shuffleDeck() - shuffles the deck into a random order and stores the
//    new shuffled deck back into the deckOfCards attribute


    public void shuffleDeck() {
       Collections.shuffle(cardDeck);
    }

//    ArrayList<Card> sortDeckInNumberOrder() - sorts the deck in number order (e.g.
//    2222333344445555 etc) and stores the new shuffled deck back into the cardDeck
//    attribute




// create a method that will sort the deck in suit order (e.g. hearts, diamonds, clubs, spades) and store the new sorted deck back into the cardDeck attribute
    public List<Card> sortDeckInSuitOrder() {
        return cardDeck.stream()
                .sorted((c1, c2) -> c1.getSuit().compareTo(c2.getSuit()))
                .collect(Collectors.toList());
    }







}
