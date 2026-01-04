package behavioural_design_patterns.state.src;

public interface OrderState {
    public void proceedToNext(Order order);
    public void cancelOrder(Order order);
    public String getCurrentStatus();
}
