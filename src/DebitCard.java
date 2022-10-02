public class DebitCard extends Card implements Payable {
    private double maxTransactionAmount;

    public DebitCard(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance, double maxTransactionAmount) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    public double getMaxTransactionAmount() {
        return maxTransactionAmount;
    }

    public void setMaxTransactionAmount(double maxTransactionAmount) {
        this.maxTransactionAmount = maxTransactionAmount;
    }

    @Override
    public void pay(double amount) {
        if (!(amount <= maxTransactionAmount && amount <= getCardBalance())) {
            System.out.println("You do NOT have enough money in your account!");
        } else {
            setCardBalance(getCardBalance() - amount);
        }
    }

    public void changeTransactionLimit(double maxTransactionAmount) {
        setMaxTransactionAmount(maxTransactionAmount);
    }

    @Override
    public String toString() {
        return "DebitCard: " + "maxTransactionAmount = " + getMaxTransactionAmount();
    }
}