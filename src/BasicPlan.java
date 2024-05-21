

public class BasicPlan {
    protected structural.bridge.User user;

    public BasicPlan(structural.bridge.User user) {
        this.user = user;
    }

    public void buyMedicine(String medicineName){
        user.buyMedicine(medicineName);
    }

    public void createHealthCheckupAppointment(String userId){
        user.createHealthCheckupAppointment(userId);
    }
}