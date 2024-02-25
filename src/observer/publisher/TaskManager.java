package observer.publisher;

import observer.listeners.TaskListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {

    Map<String, List<TaskListener>> listeners = new HashMap<>();

    public TaskManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, TaskListener listener) {
        List<TaskListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, TaskListener listener) {
        List<TaskListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String data) {
        List<TaskListener> users = listeners.get(eventType);
        for (TaskListener listener : users) {
            listener.update(eventType, data);
        }
    }
}
