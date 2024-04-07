public class CreditCard {
    long accountNumber;
    long currentAmountAccount;

    long creditingAmountAccount(int amout){
        return currentAmountAccount += amout;
    }
    long withdrawAmountAccount(int amout){
        return currentAmountAccount -= amout;
    }
    void infoCreditCard(){
        System.out.println("Номер счета карточки: " + accountNumber);
        System.out.println("Сумма на счете: " + currentAmountAccount);
    }


    public CreditCard(long accountNumber, long currentAmountAccount) {
        this.accountNumber = accountNumber;
        this.currentAmountAccount = currentAmountAccount;
    }
}
