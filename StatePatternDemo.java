// Java program to demonstrate working of
// State Design Pattern

public class StatePatternDemo {
    public static void main(String[] args)
    {
        VendingMachineState stateContext = new VendingMachineState();
        stateContext.showState();
        stateContext.showState();

        System.out.println();

        stateContext.setState(new DiscountSale());
        stateContext.showState();
        stateContext.showState();
        stateContext.showState();
    }
}
