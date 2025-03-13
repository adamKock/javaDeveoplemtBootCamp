public class DeckOfCards {
    public static void main(String[] args) {
        for (int i = 1; i <= 52; i++) {
            System.out.println(getCardString(i));
        }



        
    }













    public static String getCardString(int cardNumber) {
        String card = "";
        String rank = "";
        String suit = "";

        // Determine rank and suit
        int cardValue = (cardNumber - 1) % 13 + 1;
        int cardSuit = (cardNumber - 1) / 13;

        switch (cardValue) {
            case 1: rank = "A"; break;
            case 11: rank = "J"; break;
            case 12: rank = "Q"; break;
            case 13: rank = "K"; break;
            default: rank = String.valueOf(cardValue);
        }

        switch (cardSuit) {
            case 0: suit = "S"; break; // Spades
            case 1: suit = "H"; break; // Hearts
            case 2: suit = "C"; break; // Clubs
            case 3: suit = "D"; break; // Diamonds
        }

        // Card ASCII art
        switch (cardValue) {
            case 1:
                card = "   _____\n" +
                       "  |A    |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |     |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |____V|\n";
                break;
            case 2:
                card = "   _____\n" +
                       "  |2    |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |     |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |____Z|\n";
                break;
            case 3:
                card = "   _____\n" +
                       "  |3    |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |     |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |____E|\n";
                break;
            case 4:
                card = "   _____\n" +
                       "  |4    |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |     |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |____h|\n";
                break;
            case 5:
                card = "   _____\n" +
                       "  |5    |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |  " + suit + "  |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |____S|\n";
                break;
            case 6:
                card = "   _____\n" +
                       "  |6    |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |____6|\n";
                break;
            case 7:
                card = "   _____\n" +
                       "  |7    |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |____7|\n";
                break;
            case 8:
                card = "   _____\n" +
                       "  |8    |\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |____8|\n";
                break;
            case 9:
                card = "   _____\n" +
                       "  |9    |\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  | " + suit + " " + suit + " |\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  |____9|\n";
                break;
            case 10:
                card = "   _____\n" +
                       "  |10   |\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  |" + suit + " " + suit + " " + suit + "|\n" +
                       "  |___10|\n";
                break;
            case 11:
                card = "   _____\n" +
                       "  |J    |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |     |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |____J|\n";
                break;
            case 12:
                card = "   _____\n" +
                       "  |Q    |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |     |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |____Q|\n";
                break;
            case 13:
                card = "   _____\n" +
                       "  |K    |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |     |\n" +
                       "  |  " + suit + "  |\n" +
                       "  |____K|\n";
                break;
        }

        return card;
    }
}
