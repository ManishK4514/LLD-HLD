package strategy_pattern.src.strategy_factory_combined.src.strategy.src;

public class DiscountFactory {
    public static DiscountStrategy getDiscountType(String type) {
        return switch (type) {
            case "STUDENT_DISCOUNT" -> new StudentDiscount();
            case "FESTIVAL_DISCOUNT" -> new FestivalDiscount();
            case "PREMIUM_DISCOUNT" -> new PremiumDiscount();
            default -> throw new IllegalArgumentException("Unknown Discount Type: " + type);
        };
    } 
}
