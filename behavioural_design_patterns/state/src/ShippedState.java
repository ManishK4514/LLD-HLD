package behavioural_design_patterns.state.src;

public class ShippedState implements OrderState {
    @Override
    public void proceedToNext(Order order) {
        order.setCurrentState(new DeliveredState());
        System.out.println("Order shipped. Moving to Delivered state.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel. Order is already shipped.");
    }

    @Override
    public String getCurrentStatus() {
        return "Shipped";
    }

}
