import java.util.Collections;
import java.util.Scanner;

// By pressing enter in the command line, the user takes their turn. Each turn, a new card is dealt
//from the deck. The game continues until two cards in a row have the same symbol, at which
//point the “player” wins and the game ends

public class Snap extends CardGame {

    Scanner scanner = new Scanner(System.in);

    public Snap(String name) {
        super(name);
    }




    @Override
    public void createDeck() {
        for (int i = 0; i < Card.suitArray.length; i++) {
            for (int j = 0; j < Card.symbolArray.length; j++) {
                Card card = new Card(Card.symbolArray[j], Card.suitArray[i], j + 2 );
                deckOfCards.add(card);
            }
        }

    }


    @Override
    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
        System.out.println("********** Deck has been shuffled and is ready to play **********");
    }

    @Override
    public void dealCard() {
        Card topCard = deckOfCards.get(0);
        deckOfCards.remove(topCard);
        discardPile.add(topCard);

        System.out.println("Your card is the " + topCard.getCardName() + " of " + topCard.getSuit());
    }


    //   print out the top card on the discard pile
    public void printDiscardPileMsg() {

        System.out.println("This is now the top card on the discard pile");
        System.out.println("*********************");

    }

    public void playGame() {
        System.out.println("Welcome to Snap!");
        System.out.println("Type yes to play, or no to exit. (yes/no)");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            createDeck();
            shuffleDeck();

            System.out.println("Press the enter key to draw a card from the top of the deck");
            scanner.nextLine();
            dealCard();
            printDiscardPileMsg();


//           USING WHILE LOOP OVER THIS SECTION UNTIL THERE IS A MATCH
//
            boolean gameOver = false;

           while (!gameOver) {

               if(deckOfCards.size() == 0) {
                   System.out.println("The deck is empty. Game Over.");
                   gameOver = true;
               }


               System.out.println("Hit the enter key again to draw another card");
                scanner.nextLine();

                dealCard();
                printDiscardPileMsg();
                printLastCard();


                if (discardPile.get(discardPile.size() - 1).getCardName() == discardPile.get(discardPile.size() - 2).getCardName()) {
                    System.out.println("SNAP!!!!!!!!!!!");
                    System.out.println("********************");
                    gameOver = true;
                }
            } // END OF WHILE LOOP

            System.out.println("Play again? (yes/no)");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                deckOfCards.clear();
                discardPile.clear();
                playGame();
            } else if (answer.equals("no")) {
                System.out.println("Ok, thanks for playing!");
            }

        } else  {
            System.out.println("Ok, maybe next time.");
        }

    }




}

