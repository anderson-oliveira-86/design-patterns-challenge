package observer.model;

import observer.publisher.TaskManager;

public class TaskEmitter {
    public TaskManager tasks;

    public TaskEmitter() {
        tasks = new TaskManager("contratacao", "demissao", "ferias", "licenca_medica");
    }

    public void hiring(){
        tasks.notify("contratacao", "funcionario");
    }

    public void resignation(){
        tasks.notify("demissao", "funcionario");
    }

    public void vacation(){
        tasks.notify("ferias", "funcionario");
    }

    public void sickLeave(){
        tasks.notify("licenca_medica", "funcionario");
    }
}
