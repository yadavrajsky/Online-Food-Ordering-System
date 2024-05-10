package delivery.models;

import user.models.User;

public class DeliveryAgent {
    private int agent_id;
    private User user;

    // create delivery agent
    public DeliveryAgent(int agent_id, User user) {
        this.agent_id = agent_id;
        this.user = user;
    }

    // get agent id
    public int getAgent_id() {
        return agent_id;
    }

    // get user
    public User getUser() {
        return user;
    }

}
