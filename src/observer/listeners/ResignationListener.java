package observer.listeners;

public class ResignationListener implements TaskListener{
    private String email;

    public ResignationListener(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, String data) {
        System.out.println("Department: Benefits, Cancelamento dos benefícios para o funcionário");
    }
}
