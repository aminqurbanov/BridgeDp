

public class Driver {
    public static void main(String[] args) {

        structural.bridge.User user = new Student();

        GoldPlan plan = new GoldPlan(user);
        plan.createDoctorConsultation("User:AA1234");

        PlatinumPlan plan1 = new PlatinumPlan(user);
        plan1.createDiscountedPrice("Amin");
    }
}
