package behavioural_design_patterns.state.src;

public class DeliveredState implements OrderState {
    @Override
    public void proceedToNext(Order order) {
        System.out.println("Order is already delivered. No further state.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel. Order is already delivered.");
    }

    @Override
    public String getCurrentStatus() {
        return "Delivered";
    }

}
