public class CreditCard extends Card implements Payable {
    private final double maxOverDraft;

    public CreditCard(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance, double maxOverDraft) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxOverDraft = maxOverDraft;
    }

    public double getMaxOverDraft() {
        return maxOverDraft;
    }

    @Override
    public void pay(double paidAmount) {
        if (paidAmount >= (getCardBalance() + maxOverDraft)) {
            System.out.println("Unauthorized transaction!");
        } else {
            setCardBalance((getCardBalance() + maxOverDraft) - paidAmount);
        }
    }

    @Override
    public String toString() {
        return "CreditCard: " + "maxOverDraft = " + getMaxOverDraft();
    }
}