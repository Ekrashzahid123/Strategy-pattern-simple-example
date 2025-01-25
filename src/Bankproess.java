public class Bankproess {
    PaymentMethods paymentMethods;

    public void BankProcess() {
    }

    public void SetStrategy(PaymentMethods pb) {
        this.paymentMethods = pb;
    }

    public void pay(double amount) {
        paymentMethods.pay(amount);
    }
}
