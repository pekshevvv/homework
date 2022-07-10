public class IndividualBusinessman extends Client {

    double commissionPut = 0;
    double moneyTopUp = 0;
    double paymentAccountIndividual = 0;

    @Override

    public void put(double individualAmountToPut){
            if (individualAmountToPut < 0){
                System.out.println("ошибка: сумма пополнения отрицательная");
                return;
            if (individualAmountToPut < 1000){

                commissionPut = individualAmountToPut * 0.01;
                moneyTopUp = individualAmountToPut - commissionPut;}
            else{
                commissionPut = individualAmountToPut * 0.005;
                moneyTopUp = individualAmountToPut - commissionPut;}
            System.out.println("Комиссия на пополнение индивидуальный предприниматель= " + commissionPut);
            paymentAccountIndividual += moneyTopUp;
            super.put(paymentAccountIndividual);

        }
    }
    public void take(double amountToTakeIndividual){

        if (amountToTakeIndividual <= paymentAccountIndividual){
            paymentAccountIndividual -= amountToTakeIndividual;
        }
        super.take(paymentAccountIndividual);

    }



    public double getAmountIndividual() {
        System.out.println("Счет индивидального предпринмателя = " + paymentAccountIndividual);
        return paymentAccountIndividual;
    }
}



