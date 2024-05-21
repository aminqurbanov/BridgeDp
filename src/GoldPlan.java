

public class GoldPlan extends BasicPlan {

    public GoldPlan(structural.bridge.User user) {
        super(user);
    }

    public void createDoctorConsultation(String userId) {
        user.createDoctorConsultation(userId);
    }

    public void creditCashback(String userId) {
        user.creditCashback(userId);
    }
}
