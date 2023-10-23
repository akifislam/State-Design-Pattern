public class VendingMachineState {
    private VendingMachine currentState;

    public VendingMachineState() {
        currentState = new RegularSale();
    }

    public void setState(VendingMachine state) {
        currentState = state;
    }

    public void showState() {
        currentState.sales(this);
    }
}
