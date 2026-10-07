package _interviewResources.WordLineGlobal.Round2;

import java.math.BigDecimal;

        /*
        *
                price == null?      → if wrapper
                quantity == 0?      → valid or invalid?
                quantity < 0?       → invalid?
                price < 0?          → invalid?
                price = NaN?        → possible for double
                price = Infinity?   → possible for double
                precision?          → money should not normally use double
                overflow?           → depending on type
        *
        * */

public class OrderService {

    // Use case:
    // This variable stores the running total of all items added to an order.
    //
    // BigDecimal is used instead of double because this is money.
    // double can cause floating-point precision problems such as:
    // 0.1 + 0.2 = 0.30000000000000004
    //
    // BigDecimal gives us accurate decimal calculations for monetary values.
    private BigDecimal total = BigDecimal.ZERO;


    // Use case:
    // Add an item to the order.
    //
    // Example:
    // price = 10.50
    // quantity = 2
    // Item total = 10.50 * 2 = 21.00
    //
    // synchronized:
    // Multiple threads/users may try to add items at the same time.
    // Only one thread at a time can execute this method on the same OrderService object.
    // This prevents race conditions and lost updates.
    public synchronized void addItem(BigDecimal price, Integer quantity) {

        // Defensive coding:
        // price is a BigDecimal object, so it can contain null.
        //
        // If price is null and we try to calculate:
        // price.multiply(...)
        //
        // Java will throw NullPointerException.
        //
        // Instead of waiting for an NPE, we validate the input first
        // and provide a meaningful error message.
        if (price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }


        // Defensive coding:
        // quantity is an Integer object, so it can also contain null.
        //
        // A null quantity does not make sense for an order item.
        // Therefore, reject it before performing the calculation.
        if (quantity == null) {
            throw new IllegalArgumentException("Quantity cannot be null");
        }


        // Business rule:
        // Quantity must be greater than zero.
        //
        // quantity = 0  -> invalid
        // quantity = -2 -> invalid
        //
        // We use <= 0 because one condition handles both zero
        // and negative quantities.
        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than 0"
            );
        }


        // Business rule:
        // A negative price does not make sense for a normal order item.
        //
        // price = -100 -> invalid
        //
        // Notice that we use < 0 rather than <= 0.
        //
        // price = 0 may be valid depending on the business requirement.
        // For example, a free/promotional item could have a price of 0.
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(
                    "Price cannot be negative"
            );
        }


        // Calculate the item total.
        //
        // Example:
        // price = 10.50
        // quantity = 2
        //
        // 10.50 * 2 = 21.00
        BigDecimal itemTotal =
                price.multiply(BigDecimal.valueOf(quantity));


        // Add the item total to the existing order total.
        //
        // Example:
        // Existing total = 100.00
        // New item       = 21.00
        //
        // New total      = 121.00
        //
        // Because the method is synchronized, two threads cannot
        // perform this read-modify-write operation at the same time
        // on the same OrderService object.
        total = total.add(itemTotal);
    }


    // Use case:
    // Return the current total of the order.
    public BigDecimal getTotal() {
        return total;
    }


    // Simple example to demonstrate the program.
    public static void main(String[] args) {

        OrderService orderService = new OrderService();


        // Valid input:
        // Price = 10.50
        // Quantity = 2
        //
        // Item total = 21.00
        orderService.addItem(
                new BigDecimal("10.50"),
                2
        );


        // Another valid item:
        // Price = 5.25
        // Quantity = 2
        //
        // Item total = 10.50
        orderService.addItem(
                new BigDecimal("5.25"),
                2
        );


        // Expected total:
        //
        // 10.50 * 2 = 21.00
        // 5.25  * 2 = 10.50
        //
        // Total = 31.50
        System.out.println("Order Total: " + orderService.getTotal());
    }
}
