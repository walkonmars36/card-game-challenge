public class Main {
    public static void main(String[] args) {


        CardGame cardGame = new CardGame("cardGame");

        cardGame.createDeck();

        System.out.println("********** Print the deck in suit and number order *********");
        cardGame.getDeck();

        System.out.println("********** ******* ********* ******* ********* ******* *********");

        cardGame.shuffleDeck();

        cardGame.getDeck();

        System.out.println("********** Top card dealt from the top of the shuffled deck **********");

        cardGame.dealCard();

        cardGame.sortDeckInNumberOrder();

        cardGame.getDeck();

        System.out.println("********** ******* ********* ******* ********* ******* *********");

        cardGame.sortDeckInSuitOrder();

        cardGame.getDeck();


        Snap snap = new Snap("Snap");
        snap.playGame();

    }
}