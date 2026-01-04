package behavioural_design_patterns.state.src;

public class PaidState implements OrderState {
    @Override
    public void proceedToNext(Order order) {
        order.setCurrentState(new ShippedState());
        System.out.println("Order paid. Moving to Shipped state.");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setCurrentState(new CancelledState());
        System.out.println("Order cancelled from Paid state.");
    }

    @Override
    public String getCurrentStatus() {
        return "Paid";
    }

}
