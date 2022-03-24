public abstract class Client {

    double paymentAccount = 0;
    public double getAmount() {
        System.out.println(paymentAccount);
        return paymentAccount;
    }


    public void put(double amountToPut) {
        paymentAccount += amountToPut;
    }


    public void take(double amountToTake) {
        paymentAccount -= amountToTake;
    }

}
