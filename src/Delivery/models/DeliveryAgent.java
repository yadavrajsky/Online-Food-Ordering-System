package Delivery.models;
import  orders.models.Order;

import java.util.List;
import java.util.Map;

public class DeliveryAgent {
    //maintaining a map for each agent id to all orders assigned to him
    Map<Integer,List<Order>> pendingOrders;
    private int agent_id;

    public DeliveryAgent(Map<Integer, List<Order>> pendingOrders, int agent_id) {
        this.pendingOrders = pendingOrders;
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
