import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        Card card = new Card(true, "1111", "ro1", "john", 1000);
        DebitCard debit = new DebitCard(true, "2222", "ro2", "jake", 3000, 500);
        CreditCard credit = new CreditCard(true, "3333", "ro3", "mike", 4000, 1000);
        Address address1 = new Address("cluj", "eroilor", 7);
        Address address2 = new Address("floresti", "avram", 408);
        List<Card> cards = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        ShoppingAccount shoppingAccount = new ShoppingAccount(cards, addresses, "cortez", card, address1);

        shoppingAccount.addPaymentMethod(debit);
        shoppingAccount.addPaymentMethod(credit);
        shoppingAccount.addAddress(address1);
        shoppingAccount.addAddress(address2);
        System.out.println(shoppingAccount);
        shoppingAccount.removePaymentMethod(credit);
        shoppingAccount.removeAddress(address1);
        System.out.println(shoppingAccount);
        shoppingAccount.generateInvoice(300, "Avram", debit);
    }
}