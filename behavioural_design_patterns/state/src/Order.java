package behavioural_design_patterns.state.src;

public class Order {
    private OrderState currentState;

    public Order() {
        this.currentState = new CreatedState();
    }

    public void setCurrentState(OrderState state) {
        this.currentState = state;
    }

    public void proceedToNext() {
        currentState.proceedToNext(this);
    }

    public void cancelOrder() {
        currentState.cancelOrder(this);
    }

    public String getCurrentStatus() {
        return currentState.getCurrentStatus();
    }
}
