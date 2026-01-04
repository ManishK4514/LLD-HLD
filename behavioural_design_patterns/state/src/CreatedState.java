package behavioural_design_patterns.state.src;

public class CreatedState implements OrderState {
    @Override
    public void proceedToNext(Order order) {
        order.setCurrentState(new PaidState());
        System.out.println("Order created. Moving to Paid state.");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setCurrentState(new CancelledState());
        System.out.println("Order cancelled from Created state.");
    }

    @Override
    public String getCurrentStatus() {
        return "Created";
    }

}
