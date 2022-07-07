public class Main {
    public static void main(String[] args) {


        CardGame cardGame = new CardGame();



//        METHOD TO CREATE DECK
        cardGame.createDeck();


//        METHOD TO SHOW DECK
        cardGame.printDeck();

        cardGame.shuffleDeck();

        cardGame.dealCard();





    }
}