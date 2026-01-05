package structural_design_patterns.facade.src;

public class OrderFacade {
    private OrderValidator orderValidator;
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public OrderFacade() {
        orderValidator = new OrderValidator();
        paymentService = new PaymentService();
        inventoryService = new InventoryService();
        shippingService = new ShippingService();
        notificationService = new NotificationService();
    }

    public void placeOrder() {
        orderValidator.validateOrder();
        paymentService.pay();
        inventoryService.updateInventory();
        shippingService.shipOrder();
        notificationService.notifyUser();
    }
}
