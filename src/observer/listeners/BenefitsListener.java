package observer.listeners;

public class BenefitsListener implements TaskListener{
    private String email;

    public BenefitsListener(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, String data) {
        switch (eventType) {
            case "contratacao":
                System.out.println("Department: Benefits, Criando benefícios para o funcionário");
                break;
            case "demissao":
                System.out.println("Department: Benefits, Cancelamento dos benefícios para o funcionário");
                break;
            default:
                break;
        }

    }
}
