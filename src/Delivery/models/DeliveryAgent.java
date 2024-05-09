package Delivery.models;
import  orders.models.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryAgent {
    //maintaining a map for each agent id to all orders assigned to him
    Map<Integer,List<Order>> pendingOrders;
    private int agent_id;

    //new agent will be added to hashmap according to id
    public DeliveryAgent(int agent_id) {
        this.pendingOrders = new HashMap<>();
        pendingOrders.put(agent_id, new ArrayList<>());
        this.agent_id = agent_id;

    }

    // view pending orders assigned,  along with delivery addresses and contact information(printed toString of order).
    public void checkPendingOrders(int agent_id){
        if(!pendingOrders.containsKey(agent_id)) {
            System.out.println("agent not available!");
            return ;
        }
        for (Order ord :pendingOrders.get(agent_id))
            System.out.println(ord);
    }
    // assign a new order to the agent
    public boolean assignOrder(int agent_id, Order ord){
        if(!pendingOrders.containsKey(agent_id)) {
            System.out.println("agent not available!");
            return false;
        }
        for (int i :pendingOrders.keySet()){
            if(i==agent_id){
                pendingOrders.get(i).add(ord);
                System.out.println("Order assigned!");
            }
        }
        return true;
    }
    // mark order as competed and remove from the pending order list of the agent
    public boolean orderCompleted(int agent_id, Order ord){
        if(!pendingOrders.containsKey(agent_id)) {
            System.out.println("agent not available!");
            return false;
        }
        for (int i :pendingOrders.keySet()){
            if(i==agent_id){
                pendingOrders.get(i).remove(ord);
                System.out.println("Order Completed!\n Removed From Pending Orders.");
            }
        }
        return true;
    }


}
