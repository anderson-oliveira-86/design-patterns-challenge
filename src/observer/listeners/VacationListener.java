package observer.listeners;

public class VacationListener implements TaskListener{
    private String email;

    public VacationListener(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, String data) {
        System.out.println("Department: Vacation, Vacation");
    }
}
