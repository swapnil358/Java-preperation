
package _interviewResources.WordLineGlobal.Round2;

import java.util.HashMap;
import java.util.Map;

/*
*

Coding Assignment: You are given a method that processes an e-commerce shopping order.
It checks if an item is in stock, validates the user's account balance, deducts the balance, updates the inventory, and returns a success flag.
There are logical bugs, concurrency issues, and missing validations hidden in the code.

Phase 1 (Code Review): Read through the code and point out potential functional bugs.
Phase 2 (Automation / Test Design): Write down the test case scenarios (Positive, Negative, and Boundary values) you would use to break this method.
Phase 3 (Refactoring): Rewrite the code to fix the issues you found.
*
*
*
*
* */



public class OrderProcessor {


    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        //processor.processOrder("USER_A", "LAPTOP-01", "2", 2.5);
        //Valid data
        processor.processOrder("USER_A", "LAPTOP-01", "1", 1600.00);

        //invalid user id
        processor.processOrder("USER_B", "LAPTOP-01", "1", 1600.00);

        //invalid item id
        processor.processOrder("USER_A", "LAPTOP-02", "1", 1600.00);

        //invalid item quantity
        processor.processOrder("USER_A", "LAPTOP-02", "1", 1600.00);

        //invalid item invalid price
        processor.processOrder("USER_A", "LAPTOP-01", "1", 20000.00);


    }

    // Simulating database storage
    private final Map<String, Integer> inventory = new HashMap<>();
    private final Map<String, Double> userBalances = new HashMap<>();

    public OrderProcessor() {
        // Seed initial data
        inventory.put("LAPTOP-01", 5);
        userBalances.put("USER_A", 1500.00);
    }

    /**
     * Processes an order for a given user.
     *
     * @param userId    The ID of the purchasing user
     * @param itemId    The SKU/ID of the item
     * @param quantity  The amount the user wants to buy
     * @param itemPrice The unit price of the item
     * @return true if the order was successfully processed, false otherwise
     */
    public synchronized boolean processOrder(String userId,String itemId,String quantity,Double itemPrice) {

        //pending-use cases o, null, negative - userId,itemId,quantity,itemPrice



        // Step 1: Check inventory
        int availableStock = 0;

        if(inventory.containsKey(itemId)){
            availableStock = inventory.get(itemId);
        }else {
            System.out.println("Inventory does not contains item: " + itemId );
            return false;
        }


        if (availableStock < Integer.parseInt(quantity)) {
            System.out.println("Error: Insufficient stock.");
            return false;
        }

        // Step 2: Validate funds
        double totalPrice = Integer.parseInt(quantity) * itemPrice;


        double userBalance =0;
        if(userBalances.containsKey(userId)){
            userBalance = userBalances.get(userId);
        }else{
            System.out.println("Inventory does not contains userId: + " + userId);
            return false;
        }
        //userBalance = userBalances.get(userId);
        if (userBalance < totalPrice) {
            System.out.println("Error: Insufficient funds.");
            return false;
        }

        // Step 3: Deduct balance & update inventory
        userBalances.put(userId, userBalance - totalPrice);
        inventory.put(itemId, availableStock - Integer.parseInt(quantity));

        System.out.println("Success: Order processed for " + userId);
        return true;
    }
}
