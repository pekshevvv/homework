import net.sf.saxon.style.XSLOutput;

public class LegalPerson extends Client {

    double percent = 0.01;
    double takeMoney = 0;
    double paymentAccountLegalPerson = 0;


    @Override
    public void put(double amountToPutLegalPerson){
        if (amountToPutLegalPerson < 0){
            System.out.println("ошибка: сумма пополнения отрицательная");
            return;
        }
        else {
            paymentAccountLegalPerson += amountToPutLegalPerson;
        }
        super.put(paymentAccountLegalPerson);
    }


    public void take(double amountToTakeLegalPerson){

        if (amountToTakeLegalPerson <= paymentAccountLegalPerson){

            double amountPercentageLegalPerson = amountToTakeLegalPerson * percent;
            takeMoney = amountToTakeLegalPerson - amountPercentageLegalPerson;
            System.out.println("Комиссия на снятие юридические лица = " + amountPercentageLegalPerson);
            //System.out.println(takeMoney);
            paymentAccountLegalPerson = takeMoney;
            super.take(takeMoney);

        }

    }
    public double getAmountLegalPerson() {
        System.out.println("Счет юридического лица = " + paymentAccountLegalPerson);
        return paymentAccountLegalPerson;
    }




}
