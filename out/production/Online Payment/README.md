Create the Payable interface
- Methods:
    - pay - receives as parameter a double value

Create the Card class
- Attributes:
    - isActive
    - PIN
    - cardNumber
    - cardHolderName
    - cardBalance
- Methods:
    - changePin - changes the PIN value, but only if it's a 4 digit value
    - freezeCard - makes the card inactive

Create the DebitCard class, which will extend the Card class and implement the Payable interface
- Attributes:
    - maxTransactionAmount
- Methods:
    - pay - it will not be possible to pay more than maxTransactionAmount
    - changeTransactionLimit - will give a new value to the maxTransactionAmount attribute

Create the CreditCard class, which will extend the Card class and implement the Payable interface
- Attributes:
    - maxOverDraft - it will not be possible to change the value of this attribute
- Methods:
    - pay - it will not be possible to pay more than cardBalance + maxOverDraft

Create the Address class
- Attributes:
    - city
    - street
    - number
- Methods: only getters and setters

Create the ShoppingAccount class
- Attributes:
    - cardList
    - addressList
    - name
    - currentPaymentMethod
    - currentBillingAddress
- Methods:
    - addPaymentMethod
    - addAddress
    - removePaymentMethod
    - removeAddress
    - selectPaymentMethod(String cardNumber) - sets the currentPaymentMethod according to the cardNumber received as a parameter
    - selectAddress(String street) - sets the currentBillingAddress according to the street received as a parameter
    - generateInvoice(amount, address, card) - a message will be printed depending on the amount, the card and the address

Create the Shop class which will have a main method where implemented functionalities will be tested (a shopping account will be created, addresses and payment methods will be added to it, an address will be selected, a payment method will be selected, a payment will be made with a certain amount of money and selected payment method, then an invoice will be generated)