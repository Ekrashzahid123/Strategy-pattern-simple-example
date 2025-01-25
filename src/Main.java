public class Main {
    public static void main(String[] args) {
        Bankproess bank=new Bankproess();
        bank.SetStrategy(new Credit());
        bank.pay(500);
        bank.SetStrategy(new Paypal());
        bank.pay(400);

        
    
}
}
