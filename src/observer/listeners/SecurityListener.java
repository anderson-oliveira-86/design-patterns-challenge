package observer.listeners;

public class SecurityListener implements TaskListener{
    private String email;

    public SecurityListener(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, String data) {
        switch (eventType) {
            case "contratacao":
                System.out.println("Department: Security, New employee hired");
                break;
            case "demissao":
                System.out.println("Department: Security, Employee dismissed");
                break;
            case "ferias":
                System.out.println("Department: Security, Vacation");
                break;
            case "licenca_medica":
                System.out.println("Department: Security, Medical leave");
                break;
        }
    }
}
