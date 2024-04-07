public class Credit {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(123456, 500);
        CreditCard creditCard2 = new CreditCard(999555666, 20000);
        CreditCard creditCard3 = new CreditCard(888777111, 1523);


        creditCard1.creditingAmountAccount(123);
        creditCard2.creditingAmountAccount(5000);
        creditCard3.withdrawAmountAccount(400);

        creditCard1.infoCreditCard();
        creditCard2.infoCreditCard();
        creditCard3.infoCreditCard();
    }
}