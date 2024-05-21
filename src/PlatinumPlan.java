

public class PlatinumPlan extends GoldPlan {

    public PlatinumPlan(structural.bridge.User user) {
        super(user);
    }

    public void createPriorityConsultation(String userId) {
        user.createPriorityConsultation(userId);
    }

    public void createDiscountedPrice(String medicineName) {
        user.createDiscountedPrice(medicineName);
    }

    public void waiveOffAnnualMembership(String userId) {
        user.waiveOffAnnualMembership(userId);
    }
}