package observer;

import observer.listeners.BenefitsListener;
import observer.listeners.MedicalListener;
import observer.listeners.ResignationListener;
import observer.listeners.SecurityListener;
import observer.listeners.VacationListener;
import observer.model.TaskEmitter;

public class ObserverMain {
    public static void main(String[] args) {

        TaskEmitter taskEmitter = new TaskEmitter();

        taskEmitter.tasks.subscribe("contratacao", new SecurityListener("admin@example.com"));
        taskEmitter.tasks.subscribe("contratacao", new BenefitsListener("admin@example.com"));
        taskEmitter.tasks.subscribe("demissao", new ResignationListener("admin@example.com"));
        taskEmitter.tasks.subscribe("demissao", new SecurityListener("admin@example.com"));
        taskEmitter.tasks.subscribe("ferias", new VacationListener("admin@example.com"));
        taskEmitter.tasks.subscribe("ferias", new SecurityListener("admin@example.com"));
        taskEmitter.tasks.subscribe("licenca_medica", new SecurityListener("admin@example.com"));
        taskEmitter.tasks.subscribe("licenca_medica", new MedicalListener("admin@example.com"));



        taskEmitter.hiring();
        taskEmitter.resignation();
        taskEmitter.vacation();
        taskEmitter.sickLeave();
    }
}
