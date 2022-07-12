import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {

//    USING CLASSES, ARRAY LISTS AND METHODS, CREATE A DECK OF CARDS. YOU SHOULD USE THE FOLLOWING CLASSES -> CARD GAME -> CARD


//    HAS A NAME WHICH IS ALSO DEFINED IN THE CONSTRUCTOR
    private final String name;

    public CardGame(String name) {
        this.name = name;
    }

    //    CONTAINS AN ARRAYLIST<CARD> FOR THE DECK OF CARDS THAT CONTAINS ALL 52 CARDS.
    ArrayList<Card> deckOfCards = new ArrayList<>();
    public ArrayList<Card> getDeckOfCards() {return deckOfCards;}


    ArrayList<Card> discardPile = new ArrayList<>();

    public ArrayList<Card> getDiscardPile() {return discardPile;}


    public Card getLastCard() {
        return discardPile.get(discardPile.size() - 2);

    }

    public void printLastCard() {
        System.out.println("The last card in the discard pile was the " + getLastCard().getCardName() + " of " + getLastCard().getSuit());  System.out.println("*********************");
    }


    //    DECK IS CREATED AND POPULATED WHEN THE GAME IS CONSTRUCTED
    public void createDeck() {
       for (int i = 0; i < Card.suitArray.length; i++) {
           for (int j = 0; j < Card.symbolArray.length; j++) {
             Card card = new Card(Card.symbolArray[j], Card.suitArray[i], j + 2 );

              deckOfCards.add(card);
           }
       }
        System.out.println("********** Deck created **********");
   }

    //    HAS A GET DECK METHOD THAT LISTS OUT THE CARDS IN THE DECK
    public void getDeck() {
        for (Card card: deckOfCards) {
            card.printCard();

        }
    }

//    Card dealCard() - takes the card from the top of the deck and returns it
    public void dealCard() {
        Card topCard = deckOfCards.get(0);
        deckOfCards.remove(topCard);
        discardPile.add(topCard);
        System.out.println("You have drawn the " + topCard.getCardName() + " of " + topCard.getSuit());
     }

//    ArrayList<Card> shuffleDeck() - shuffles the deck into a random order and stores the
//    new shuffled deck back into the deckOfCards attribute
    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
        System.out.println("********** Deck has been shuffled **********");
    }


//    ArrayList<Card> sortDeckInNumberOrder() - sorts the deck in number order (e.g.
//    2222333344445555 etc) and stores the new shuffled deck back into the cardDeck
//    attribute.
    public void sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, (a, b) -> a.getValue() - b.getValue());
        System.out.println("********** Deck is now sorted in number order **********");

    }


// create a method that will sort the deck in suit order (e.g. hearts, diamonds, clubs, spades) and store the new sorted deck back into the cardDeck attribute
    public void sortDeckInSuitOrder() {
        Collections.sort(deckOfCards, (a, b) -> a.getSuit().compareTo(b.getSuit()));
        System.out.println("********** Deck is now sorted in suit order **********");
    }


    //   print out the top card on the discard pile
    public void printDiscardPileMsg() {

        System.out.println("This is now the top card on the discard pile");
        System.out.println("*********************");

        }

    }





