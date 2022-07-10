public class Main {
    public static void main(String[] args) {

        IndividualBusinessman individualBusinessman = new IndividualBusinessman();
        individualBusinessman.put(500);
        individualBusinessman.take(200);
        individualBusinessman.getAmountIndividual();
        //individualBusinessman.getAmount();
        System.out.println();



        PhysicalPerson physicalPerson = new PhysicalPerson();
        physicalPerson.put(1200);
        physicalPerson.take(200);
        physicalPerson.getAmountPhysical();
        System.out.println();

        LegalPerson legalPerson = new LegalPerson();
        legalPerson.put(1500);
        legalPerson.take(1205);
        legalPerson.getAmountLegalPerson();
        //System.out.println();

    }
}
