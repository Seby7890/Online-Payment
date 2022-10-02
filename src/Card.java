public class Card {
    private boolean isActive;
    private String PIN;
    private String cardNumber;
    private String cardHolderName;
    private double cardBalance;

    public Card(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance) {
        this.isActive = isActive;
        this.PIN = PIN;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPIN() {
        return PIN;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void changePin(String PIN) {
        if (PIN.length() != 4) {
            System.out.println("Pin is NOT 4 digits long.");
        }

        for (int i = 0; i < PIN.length(); i++) {
            if (!Character.isDigit(PIN.charAt(i))) {
                System.out.println("Please type only digits.");
            }
        }
        this.PIN = PIN;
    }

    public void freezeCard() {
        isActive = false;
    }

    @Override
    public String toString() {
        return "Card: " + "isActive = " + isActive + "; PIN = " + PIN + "; cardNumber = " + cardNumber + "; cardHolderName = " + cardHolderName + "; cardBalance = " + cardBalance;
    }
}