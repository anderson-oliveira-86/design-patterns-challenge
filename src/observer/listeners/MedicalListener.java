package observer.listeners;

public class MedicalListener implements TaskListener{
    private String email;

    public MedicalListener(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, String data) {
        System.out.println("Department: Medical, Acompanhamento da licença médica do funcionário");
    }
}
