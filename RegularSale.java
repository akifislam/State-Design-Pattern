public class RegularSale implements VendingMachine {
    @Override
    public void sales(VendingMachineState ctx) {
        System.out.println("This vending Machine is now on regular sale. No Discount Available !");
    }
}
