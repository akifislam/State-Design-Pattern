public class DiscountSale implements VendingMachine {
    @Override
    public void sales(VendingMachineState ctx) {
        System.out.println("This vending Machine provides 20% discount on all items");
    }
}
