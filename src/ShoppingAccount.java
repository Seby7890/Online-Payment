import java.util.List;

public class ShoppingAccount {
    private List<Card> cardList;
    private List<Address> addressList;
    private String name;
    private Card currentPaymentMethod;
    private Address currentBillingAddress;

    public ShoppingAccount(List<Card> cardList, List<Address> addressList, String name, Card currentPaymentMethod, Address currentBillingAddress) {
        this.cardList = cardList;
        this.addressList = addressList;
        this.name = name;
        this.currentPaymentMethod = currentPaymentMethod;
        this.currentBillingAddress = currentBillingAddress;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCurrentPaymentMethod() {
        return currentPaymentMethod;
    }

    public void setCurrentPaymentMethod(Card currentPaymentMethod) {
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public Address getCurrentBillingAddress() {
        return currentBillingAddress;
    }

    public void setCurrentBillingAddress(Address currentBillingAddress) {
        this.currentBillingAddress = currentBillingAddress;
    }

    public void addPaymentMethod(Card card) {
        if (card.getCardNumber() != null) {
            cardList.add(card);
        } else {
            System.out.println("Cannot duplicate card!");
        }
    }

    public void addAddress(Address address) {
        if ((address.getCity() != null) && (address.getCity() != null) && (address.getNumber() != 0)) {
            addressList.add(address);
        } else {
            System.out.println("Address is already in the list!");
        }
    }

    public void removePaymentMethod(Card card) {
        for (int i = 0; i < cardList.size(); i++) {
            if (card.equals(cardList.get(i))) {
                cardList.remove(i);
            }
        }
    }

    public void removeAddress(Address address) {
        for (int i = 0; i < addressList.size(); i++) {
            if (address.equals(addressList.get(i))) {
                addressList.remove(i);
            }
        }
    }

    public Card selectPaymentMethod(String cardNumber) {

        return null;
    }

    public Address selectAddress(String street) {

        return null;
    }

    public void generateInvoice(double amount, String address, Card card) {
        System.out.println(getName() + " has paid the following amount: " + amount + "; at the address: " + address + "; using the card: " + card + ".");
    }

    @Override
    public String toString() {
        return "ShoppingAccount: " + "cardList = " + getCardList() + ", addressList = " + getAddressList() + ", name = " + getName() + ", currentPaymentMethod = " + getCurrentPaymentMethod() + ", currentBillingAddress = " + getCurrentBillingAddress();
    }
}