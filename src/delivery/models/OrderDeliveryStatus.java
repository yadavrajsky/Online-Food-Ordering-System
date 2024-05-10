package delivery.models;

import orders.models.Order;

enum Status {
    ASSIGNED,
    DELIVERED,
    PENDING
}

public class OrderDeliveryStatus {
    private DeliveryAgent deliveryAgent;
    private Status status;
    private Order order;

    // Create constructor
    public OrderDeliveryStatus(Order order, DeliveryAgent deliveryAgent) {
        this.order = order;
        this.deliveryAgent = deliveryAgent;
        this.status = Status.PENDING;
    }

    public OrderDeliveryStatus(Order order) {
        this.order = order;
        this.status = Status.ASSIGNED;
    }


    public void deliverOrder() {
        this.status = Status.DELIVERED;
    }

    public Status getStatus() {
        return status;
    }

    public Order getOrder() {
        return order;
    }

    // changeStatus to pending
    public void pendingDelivery() {
        this.status = Status.PENDING;
    }

    // get delivery agent
    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }
}
