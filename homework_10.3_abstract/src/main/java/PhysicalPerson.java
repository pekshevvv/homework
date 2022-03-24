public class PhysicalPerson extends Client {


        double paymentAccountPhysical = 0;


        @Override
        public void put(double amountToPutPhysical){
            if (amountToPutPhysical < 0){
                System.out.println("ошибка: сумма пополнения отрицательная");
                return;
            }
            else {
                paymentAccountPhysical += amountToPutPhysical;
            }
            super.take(paymentAccountPhysical);
        }


        public void take(double amountToTakePhysical){

            if (amountToTakePhysical <= paymentAccountPhysical){
                paymentAccountPhysical -= amountToTakePhysical;
            }

        }
        public double getAmountPhysical() {
            System.out.println("Счет физического лица = " + paymentAccountPhysical);
            return paymentAccountPhysical;
        }










    };

